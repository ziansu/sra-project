public static boolean isVersionEclipse3x() {
    if ((javarush.eclipse.core.utils.Util.mVersion) == null) {
        javarush.eclipse.core.utils.Util.mVersion = javarush.eclipse.core.utils.Util.getVersion("eclipse.buildId");
        if ((javarush.eclipse.core.utils.Util.mVersion) == 0)
            javarush.eclipse.core.utils.Util.mVersion = javarush.eclipse.core.utils.Util.getVersion("osgi.framework.version");
        
    }
    return 3 == (javarush.eclipse.core.utils.Util.mVersion);
}