public void run() {
    slash.navigation.converter.gui.RouteConverter r = slash.navigation.converter.gui.RouteConverter.getInstance();
    r.getContext().getActionManager().run("select-all");
    r.getInsertPositionFacade().insertAllWaypoints();
    r.setRouteCharacteristics(slash.navigation.base.RouteCharacteristics.Track);
}