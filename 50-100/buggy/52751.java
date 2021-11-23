public java.lang.String[] getSubtitles() {
    java.lang.String[] subs = new java.lang.String[2];
    java.lang.String[] routines = jaci.openrio.module.routines.Routines.getAvailableRoutines();
    if ((routines.length) > 0) {
        subs[0] = "Active: " + (routines[jaci.openrio.module.routines.addon.ToastDroidHandler.selection]);
        subs[1] = "Available: " + (java.lang.String.join(", ", routines));
    }else
        subs[0] = "No Routines Available";
    
    return subs;
}