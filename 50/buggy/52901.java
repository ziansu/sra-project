public static void init() {
    org.mozilla.javascript.Context context = org.mozilla.javascript.Context.enter();
    ru.ekipogh.sud.Script.scope = context.initStandardObjects();
    ru.ekipogh.sud.Script.fileScipts = new java.util.HashMap<>();
    org.mozilla.javascript.Context.exit();
}