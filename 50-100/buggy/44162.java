public void onDismiss() {
    visible = false;
    mapActivity.getMapView().setMapPositionX(0);
    mapActivity.getMapView().refreshMap();
    net.osmand.plus.helpers.AndroidUiHelper.updateVisibility(mapActivity.findViewById(R.id.map_route_land_left_margin), false);
    net.osmand.plus.helpers.AndroidUiHelper.updateVisibility(mapActivity.findViewById(R.id.map_right_widgets_panel), true);
    if (switched) {
        mapControlsLayer.switchToRouteFollowingLayout();
    }
    if ((getTargets().getPointToNavigate()) == null) {
        mapActivity.getMapActions().stopNavigationWithoutConfirm();
    }
}