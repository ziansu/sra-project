public com.cube.storm.LanguageSettings build() {
    com.cube.storm.LanguageSettings.instance = construct;
    construct.defaultLanguage = construct.getLanguageManager().loadLanguage(context, defaultLanguageUri);
    if ((construct.fallbackLanguage) != null) {
        construct.fallbackLanguage = construct.getLanguageManager().loadLanguage(context, fallbackLanguageUri);
    }
    return com.cube.storm.LanguageSettings.instance;
}