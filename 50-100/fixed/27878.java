public static void logout(javax.servlet.http.HttpSession session, boolean timedOut) {
    if (session == null) {
        return ;
    }
    org.simplity.service.ServiceData inData = org.simplity.http.HttpAgent.createServiceData(session, true);
    if (inData == null) {
        org.simplity.kernel.Tracer.trace("No active session found, and hence logout not called");
        return ;
    }
    if (timedOut) {
        inData.put(ServiceProtocol.TIMED_OUT, Value.VALUE_TRUE);
    }
    org.simplity.service.ServiceAgent.getAgent().logout(inData);
    org.simplity.http.HttpAgent.removeSession(session);
}