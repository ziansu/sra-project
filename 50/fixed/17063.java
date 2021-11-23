public static java.lang.String get(java.lang.String key) {
    if (key == null)
        return null;
    
    return cn.labsoft.labos.i18n.util.TranslateUtil.pros.getProperty(key.trim());
}