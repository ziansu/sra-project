public org.javarosa.core.test.FormParseInit loadAndInitForm(java.lang.String formFileInApp) {
    org.javarosa.core.test.FormParseInit fpi = new org.javarosa.core.test.FormParseInit(((APP_BASE) + formFileInApp));
    org.javarosa.form.api.FormEntryController fec = fpi.getFormEntryController();
    fec.jumpToIndex(org.javarosa.core.model.FormIndex.createBeginningOfFormIndex());
    org.javarosa.core.model.FormDef fd = fpi.getFormDef();
    fd.initialize(true, mSessionWrapper.getIIF());
    return fpi;
}