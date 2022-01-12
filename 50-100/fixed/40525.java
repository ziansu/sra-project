private org.reactome.web.diagram.controls.settings.tabs.Widget getProfilesWidget(java.lang.String title, org.reactome.web.diagram.controls.settings.tabs.ListBox profileListBox, java.util.List<java.lang.String> profileNames) {
    profileListBox.setMultipleSelect(false);
    for (java.lang.String name : profileNames) {
        profileListBox.addItem(name);
    }
    org.reactome.web.diagram.controls.settings.tabs.Label lb = new org.reactome.web.diagram.controls.settings.tabs.Label(title);
    lb.setStyleName(org.reactome.web.diagram.controls.settings.tabs.ProfilesTabPanel.RESOURCES.getCSS().profileLabel());
    org.reactome.web.diagram.controls.settings.tabs.FlowPanel fp = new org.reactome.web.diagram.controls.settings.tabs.FlowPanel();
    fp.add(lb);
    fp.add(profileListBox);
    return fp;
}