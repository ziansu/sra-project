public static void initialize(java.lang.String staticContext) {
    if (staticContext != null) {
        org.futurepages.core.path.Paths.INSTANCE = new org.futurepages.core.path.StaticPaths(staticContext);
    }else {
        org.futurepages.core.path.Paths.INSTANCE = new org.futurepages.core.path.Paths();
    }
}