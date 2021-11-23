public static boolean pathIsValid(java.lang.String strPath) {
    for (java.lang.String existFile : com.izforge.izpack.panels.jdkpath.JDKPathPanelHelper.testFiles) {
        java.io.File path = new java.io.File(strPath, existFile).getAbsoluteFile();
        if (!(path.exists())) {
            return false;
        }
    }
    return true;
}