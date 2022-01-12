@java.lang.Override
public void refresh() {
    super.refresh();
    org.cirqwizard.settings.DispensingSettings settings = org.cirqwizard.settings.SettingsFactory.getDispensingSettings();
    getMainApplication().getContext().setG54Z(settings.getZOffset().getValue());
    pcbPane.setGerberColor(PCBPane.SOLDER_PAD_COLOR);
    pcbPane.setToolpathColor(PCBPane.PASTE_TOOLPATH_COLOR);
    pcbPane.setGerberPrimitives(getMainApplication().getContext().getPanel().getCombinedElements(Board.LayerType.SOLDER_PASTE));
}