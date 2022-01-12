private void search(com.runbox.debug.manager.BreakpointManager.AccessBreakpoint breakpoint) {
    java.util.List<com.sun.jdi.ReferenceType> types = com.runbox.debug.manager.MachineManager.instance().allClasses();
    for (com.sun.jdi.ReferenceType type : types) {
        com.sun.jdi.Field field = com.runbox.debug.manager.BreakpointManager.instance().find(breakpoint, type);
        if (null != field) {
            java.lang.System.out.println("aaaaaaaaaaaaaaaa");
            com.runbox.debug.manager.RequestManager.instance().createBreakpointRequest(field, breakpoint);
        }
    }
}