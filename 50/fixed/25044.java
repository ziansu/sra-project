protected org.eclipse.cdt.dsf.debug.service.IDsfBreakpointExtension getFilterExtension(org.eclipse.cdt.debug.core.model.ICBreakpoint bp) throws org.eclipse.core.runtime.CoreException {
    return ((org.eclipse.cdt.dsf.debug.service.IDsfBreakpointExtension) (bp.getExtension(org.eclipse.cdt.dsf.mi.service.MIBreakpointsManager.GDB_DEBUG_MODEL_ID, org.eclipse.cdt.debug.core.model.ICBreakpointExtension.class)));
}