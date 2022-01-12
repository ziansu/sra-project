private void updateMaster() {
    if (masterExists()) {
        int sum = 0;
        for (bei.m3c.widgets.LightWidget lightWidget : largeLightWidgets.subList(1, largeLightWidgets.size())) {
            sum += lightWidget.getValue();
        }
        largeLightWidgets.get(0).setValue(sum);
    }
}