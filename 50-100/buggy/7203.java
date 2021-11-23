public emerald.portal.JourneyBuilder clickMessageBoxActionMenu() {
    boolean open = false;
    if (core.Actions.find(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.JourneyBuilder.mbActionMenu)) {
        open = true;
    }
    core.Actions.click(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.JourneyBuilder.btnMessageActionMenu);
    core.Wait.waitFor(common.DriverManager.getDriver(DriverType.LOOP), emerald.portal.JourneyBuilder.inspectorPanel, (!open));
    return this;
}