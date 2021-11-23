private void retryWatches(boolean forceVarCreate) {
    try {
        postDeactivateBreakpoints();
        for (org.netbeans.modules.cnd.debugger.gdb2.WatchVariable wv : watches) {
            org.netbeans.modules.cnd.debugger.gdb2.GdbWatch w = ((org.netbeans.modules.cnd.debugger.gdb2.GdbWatch) (wv));
            if (forceVarCreate || ((w.getNativeWatch().watch().getPin()) != null)) {
                if ((w.getMIName()) != null) {
                    continue;
                }
                createMIVar(w, true);
            }
        }
    } finally {
        postActivateBreakpoints();
    }
}