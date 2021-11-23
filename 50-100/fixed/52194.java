@java.lang.Override
public com.google.gwt.safehtml.shared.SafeHtml getTooltip() {
    com.google.gwt.safehtml.shared.SafeHtml tooltip = null;
    if (((!(getModel().isVmDown())) && (getModel().isHotPlugAvailable())) && (!(getModel().getIsDiskHotPlugSupported()))) {
        tooltip = com.google.gwt.safehtml.shared.SafeHtmlUtils.fromString(org.ovirt.engine.ui.common.widget.uicommon.vm.VmDiskListModelTable.constants.diskHotPlugNotSupported());
    }
    return tooltip;
}