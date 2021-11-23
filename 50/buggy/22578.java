public static boolean isI18nImplemented() {
    return (com.home.builderforms.LanguageUtil.i18n) && ("on".equals(com.appnetix.app.control.web.multitenancy.util.MultiTenancyUtil.getTenantContext().getAttribute("internationalization")));
}