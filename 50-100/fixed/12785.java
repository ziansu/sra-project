@com.google.gwt.uibinder.client.UiHandler(value = "versionSelect")
protected void onVersionChange(com.google.gwt.event.dom.client.ChangeEvent e) {
    java.lang.String version = versionSelect.getSelectedValue();
    for (com.siemens.plm.hackathon.haystatck.shared.VersionDTO v : this.versions) {
        if (v.getName().equals(version)) {
            populateBaselines(v.getBaselines());
            break;
        }
    }
    getRepositories(this.getCurrentProduct(), version);
}