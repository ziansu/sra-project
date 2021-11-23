public static org.eclipse.cdt.dsf.service.DsfSession startDsfSession(org.eclipse.tracecompass.tmf.core.trace.ITmfTrace trace) {
    org.eclipse.cdt.dsf.service.DsfSession session = org.eclipse.tracecompass.internal.dsf.core.DsfTraceSessionManager.fTraceToSessionMap.get(trace);
    if (session != null) {
        return session;
    }
    final org.eclipse.cdt.dsf.concurrent.DefaultDsfExecutor dsfExecutor = new org.eclipse.cdt.dsf.concurrent.DefaultDsfExecutor(org.eclipse.tracecompass.internal.dsf.core.DsfTraceSessionManager.TRACE_DEBUG_MODEL_ID);
    dsfExecutor.prestartCoreThread();
    session = org.eclipse.cdt.dsf.service.DsfSession.startSession(dsfExecutor, org.eclipse.tracecompass.internal.dsf.core.DsfTraceSessionManager.TRACE_DEBUG_MODEL_ID);
    org.eclipse.tracecompass.internal.dsf.core.DsfTraceSessionManager.startServices(session, trace);
    org.eclipse.tracecompass.internal.dsf.core.DsfTraceSessionManager.fTraceToSessionMap.put(trace, session);
    return session;
}