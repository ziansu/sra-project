@java.lang.Override
public boolean performOk() {
    boolean ok = super.performOk();
    org.talend.dataprofiler.core.ui.pref.I18nPreferencePage.LocalToLanguageEnum language = org.talend.dataprofiler.core.ui.pref.I18nPreferencePage.LocalToLanguageEnum.findLocal(execCombo.getText());
    getPreferenceStore().setValue(PluginConstant.LANGUAGE_SELECTOR, language.getShortOfLocale());
    try {
        InstanceScope.INSTANCE.getNode(CorePlugin.PLUGIN_ID).flush();
    } catch (org.osgi.service.prefs.BackingStoreException e) {
        org.talend.dataprofiler.core.ui.pref.I18nPreferencePage.log.error(e);
    }
    saveLanguageType();
    return ok;
}