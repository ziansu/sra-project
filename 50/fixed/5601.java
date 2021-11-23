private static java.lang.Class findClass(java.lang.String className) {
    try {
        return java.lang.Class.forName(className, false, com.oslorde.extra.ClassTools.loader);
    } catch (java.lang.Throwable e) {
        com.oslorde.extra.Utils.log(e.getMessage());
    }
    return null;
}