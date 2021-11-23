private static void initFactory() {
    java.lang.Class cl;
    try {
        cl = org.lex.perf.api.factory.IndexFactory.class.getClassLoader().loadClass("org.lex.perf.impl.IndexFactoryImpl");
        org.lex.perf.api.factory.IndexFactory.indexFactory = ((org.lex.perf.api.factory.IndexFactory.IIndexFactory) (cl.newInstance()));
    } catch (java.lang.Exception e) {
        org.lex.perf.api.factory.IndexFactory.LOGGER.error("Can't instantiate IndexFactory", e);
        org.lex.perf.api.factory.IndexFactory.indexFactory = new org.lex.perf.api.factory.NopIndexFactory();
    }
}