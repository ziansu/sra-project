public java.lang.String[] getSubtitles() {
    java.lang.String[] subs;
    java.lang.String[] routines = jaci.openrio.module.routines.Routines.getAvailableRoutines();
    if ((routines.length) > 0) {
        subs = new java.lang.String[2];
        subs[0] = "Active: " + (routines[jaci.openrio.module.routines.addon.ToastDroidHandler.selection]);
        subs[1] = "Available: " + (java.lang.String.join(", ", routines));
    }else {
        subs = new java.lang.String[1];
        subs[0] = "No Routines Available";
    }
    return subs;
}