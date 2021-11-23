private static void fillProperties(final org.eclipse.kura.web.shared.model.GwtConfigComponent config, final java.lang.String pid) {
    if (((config.getFactoryId()) != null) && (config.getFactoryId().contains("WireAsset"))) {
        config.getProperties().put("driver.pid", org.eclipse.kura.web.client.ui.wires.WiresPanelUi.getDriver(pid));
    }
    org.eclipse.kura.web.client.ui.wires.WiresPanelUi.render(config, pid);
}