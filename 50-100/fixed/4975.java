public static java.util.Set<org.coreasm.eclipse.debug.ui.views.ASMUpdate> wrapUpdateSet(java.util.Set<org.coreasm.engine.absstorage.Update> updates, boolean consistent, org.coreasm.engine.ControlAPI capi) {
    if (updates == null)
        return null;
    
    java.util.HashSet<org.coreasm.eclipse.debug.ui.views.ASMUpdate> asmUpdateSet = new java.util.HashSet<org.coreasm.eclipse.debug.ui.views.ASMUpdate>();
    for (org.coreasm.engine.absstorage.Update update : updates)
        asmUpdateSet.add(new org.coreasm.eclipse.debug.ui.views.ASMUpdate(update, consistent, capi));
    
    return asmUpdateSet;
}