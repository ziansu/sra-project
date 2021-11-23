@java.lang.Override
public java.lang.String loadStringResource(org.apache.wicket.Component component, java.lang.String key, java.util.Locale locale, java.lang.String style, java.lang.String variation) {
    if (locale == null) {
        locale = (org.apache.wicket.Session.exists()) ? org.apache.wicket.Session.get().getLocale() : java.util.Locale.getDefault();
    }
    return resourceLoader.translate(key, null, locale, key);
}