private void createForm(org.roda.wui.client.browse.SupportedMetadataTypeBundle bundle) {
    formOrXML.clear();
    metadataXML.setText(this.bundle.getXml());
    org.roda.wui.client.browse.CreateForm.create(formOrXML, bundle.getValues(), true);
}