@java.lang.Override
protected boolean checkFieldsValue() {
    if (org.talend.core.language.LanguageManager.getCurrentLanguage().equals(ECodeLanguage.JAVA)) {
        return checkJavaFieldsValue();
    }else
        if (org.talend.core.language.LanguageManager.getCurrentLanguage().equals(ECodeLanguage.PERL)) {
            return checkPerlFieldsValue();
        }else {
            updateStatus(IStatus.ERROR, null);
            return true;
        }
    
}