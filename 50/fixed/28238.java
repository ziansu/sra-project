@lombok.Synchronized
public static final void setLocale(final java.util.Locale locale) {
    if (!(locale.getLanguage().equals(com.heliosphere.athena.base.resource.bundle.ResourceBundleManager.locale.getLanguage()))) {
        com.heliosphere.athena.base.resource.bundle.ResourceBundleManager.refresh(locale);
    }
}