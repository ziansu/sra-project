public void run() {
    slash.navigation.converter.gui.RouteConverter r = slash.navigation.converter.gui.RouteConverter.getInstance();
    r.setRouteCharacteristics(slash.navigation.base.RouteCharacteristics.Route);
    r.selectInsignificantPositions(100);
    r.getContext().getActionManager().run("delete");
}