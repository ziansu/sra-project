private static com.googlecode.cchlib.i18n.core.AutoI18nCore initI18n() {
    final com.googlecode.cchlib.apps.duplicatefiles.AppToolKit appToolKit = com.googlecode.cchlib.apps.duplicatefiles.AppToolKitService.getInstance().getAppToolKit();
    return com.googlecode.cchlib.i18n.core.AutoI18nCoreFactory.createAutoI18nCore(com.googlecode.cchlib.apps.duplicatefiles.AutoI18nConfigService.getInstance().getAutoI18nConfig(), appToolKit.getI18nResourceBundleName(), appToolKit.getValidLocale());
}