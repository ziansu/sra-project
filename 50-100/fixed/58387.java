@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.map_setting_menu :
            openMenu();
            break;
        case R.id.place_search :
            PlaceSearch();
            break;
        case R.id.route_search :
            RouteSearch(true);
            break;
        case R.id.map_clear :
            MapClear();
            break;
    }
}