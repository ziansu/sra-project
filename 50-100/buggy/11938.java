private void updateMaster() {
    if (masterExists()) {
        int realLightsCount = getRealLightsCount();
        int sum = 0;
        for (bei.m3c.widgets.LightWidget lightWidget : largeLightWidgets.subList(1, largeLightWidgets.size())) {
            sum += lightWidget.getValue();
        }
        largeLightWidgets.get(0).setValue(java.lang.Math.round((sum / realLightsCount)));
    }
}