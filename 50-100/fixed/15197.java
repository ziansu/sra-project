private void initFilterWidget() {
    enableFilter = new org.gwtbootstrap3.client.ui.CheckBox();
    enableFilter.setText(org.ovirt.engine.ui.common.widget.uicommon.hosts.hostdev.HostDeviceFilterWidget.constants.enableFilterOfHostDevice());
    enableFilter.setValue(true);
    filterline = new org.ovirt.engine.ui.common.widget.WidgetWithInfo(enableFilter);
    filterline.setExplanation(com.google.gwt.safehtml.shared.SafeHtmlUtils.fromTrustedString(createSpiceInvocationInfo()));
    filterline.addInfoIconStyle("cpv_infoIcon_pfly_fix");
    editButton = new org.gwtbootstrap3.client.ui.Button();
    editButton.setText(org.ovirt.engine.ui.common.widget.uicommon.hosts.hostdev.HostDeviceFilterWidget.constants.editFilterOfHostDevice());
    editButton.setVisible(false);
}