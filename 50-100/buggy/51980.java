public static java.lang.String getLocalization(java.lang.String _key, java.lang.String[] variables) {
    try {
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org.oulu.tol.tsarni.workflow.engine.localization.language", org.oulu.tol.tsarni.workflow.engine.ApplicationContext.getLocale());
        java.lang.String value = bundle.getString(_key);
        for (int i = 0; i < (variables.length); i++) {
            value.replace((("{" + i) + "}"), variables[i]);
        }
        return value;
    } catch (java.util.MissingResourceException e) {
        return _key;
    }
}