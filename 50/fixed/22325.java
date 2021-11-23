private void createForm(org.roda.wui.client.browse.SupportedMetadataTypeBundle bundle) {
    formOrXML.clear();
    org.roda.wui.client.browse.CreateForm.create(formOrXML, bundle.getValues(), true);
}