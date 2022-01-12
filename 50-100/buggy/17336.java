@java.lang.Override
public void refresh() {
    pcbPane.setToolpathColor(PCBPane.ENABLED_TOOLPATH_COLOR);
    pcbPane.setGerberPrimitives(getMainApplication().getContext().getPanel().getCombinedElements(getCurrentLayer()));
    super.refresh();
    getMainApplication().getContext().setG54Z(org.cirqwizard.settings.SettingsFactory.getRubOutSettings().getZOffset().getValue());
}