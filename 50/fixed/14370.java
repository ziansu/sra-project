public static void init(android.content.Context context) {
    if ((xiaofei.library.hermes.Hermes.sContext) != null) {
        return ;
    }
    xiaofei.library.hermes.Hermes.sContext = context.getApplicationContext();
}