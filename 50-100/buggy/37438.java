public static net.fortuna.ical4j.connector.dav.PathResolver createPathResolver() {
    net.fortuna.ical4j.connector.dav.PathResolver.GenericPathResolver pathResolver = new net.fortuna.ical4j.connector.dav.PathResolver.GenericPathResolver();
    java.lang.String basePath = net.sf.borg.common.Prefs.getPref(PrefName.CALDAV_PATH);
    if (!(basePath.endsWith("/")))
        basePath += "/";
    
    pathResolver.setPrincipalPath((basePath + (net.sf.borg.common.Prefs.getPref(PrefName.CALDAV_PRINCIPAL_PATH))));
    pathResolver.setUserPath((basePath + (net.sf.borg.common.Prefs.getPref(PrefName.CALDAV_USER_PATH))));
    return pathResolver;
}