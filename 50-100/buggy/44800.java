public void onBrowserEvent(org.ovirt.engine.ui.common.widget.table.cell.Context context, com.google.gwt.dom.client.Element parent, C value, java.lang.String tooltipContent, com.google.gwt.dom.client.NativeEvent event, com.google.gwt.cell.client.ValueUpdater<C> valueUpdater) {
    java.lang.String tooltip;
    if (tooltipContent == null) {
        tooltip = getTooltip(value);
    }else {
        tooltip = tooltipContent;
    }
    org.ovirt.engine.ui.common.widget.tooltip.ElementTooltipUtils.setTooltipOnElement(tooltip, parent);
    if (BrowserEvents.MOUSEOVER.equals(event.getType())) {
        org.ovirt.engine.ui.common.widget.tooltip.ElementTooltipUtils.setTooltipOnElement(tooltip, parent);
    }
    super.onBrowserEvent(context, parent, value, event, valueUpdater);
}