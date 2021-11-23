@java.lang.Override
protected void createFormContent(org.eclipse.ui.forms.IManagedForm managedForm) {
    setFormTitle(org.talend.dataprofiler.core.i18n.internal.DefaultMessagesImpl.getString("MatchMasterDetailsPage.tableAna"));
    setMetadataSectionTitle(org.talend.dataprofiler.core.i18n.internal.DefaultMessagesImpl.getString("TableMasterDetailsPage.analysisMeta"));
    setMetadataSectionDescription(org.talend.dataprofiler.core.i18n.internal.DefaultMessagesImpl.getString("TableMasterDetailsPage.setPropOfAnalysis"));
    super.createFormContent(managedForm);
    createDataSection();
    createSelectRecordLinkageSection();
    createBlockingKeySection();
    createMatchingKeySection();
    createMatchAndSurvivorKeySection();
    createDefaultSurvivorshipSection();
    createParticularDefaultSurvivorshipSection();
    createMatchParameterSection();
    form.reflow(true);
}