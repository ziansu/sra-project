public static void init(android.content.Context context) {
    if ((xiaofei.library.hermes.Hermes.sContext) != null) {
        throw new java.lang.IllegalStateException("Hermes has already been initialized before.");
    }
    xiaofei.library.hermes.Hermes.sContext = context.getApplicationContext();
}