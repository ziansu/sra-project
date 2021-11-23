@java.lang.Override
public com.google.gwt.safehtml.shared.SafeHtml getTooltip() {
    java.lang.String tooltip = null;
    if (((!(getModel().isVmDown())) && (getModel().isHotPlugAvailable())) && (!(getModel().getIsDiskHotPlugSupported()))) {
        tooltip = org.ovirt.engine.ui.common.widget.uicommon.vm.VmDiskListModelTable.constants.diskHotPlugNotSupported();
    }else {
        tooltip = this.getText();
    }
    return com.google.gwt.safehtml.shared.SafeHtmlUtils.fromString(tooltip);
}