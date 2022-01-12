@java.lang.Override
public void onGroupExpand(int groupPosition) {
    onGroupClicked = false;
    if (((lastExpandedPosition) != (-1)) && (groupPosition != (lastExpandedPosition))) {
        lv.collapseGroup(lastExpandedPosition);
    }
    onGroupClicked = true;
    lastExpandedPosition = groupPosition;
    selectTour(tourlist.city(visibleCity).tours().get(groupPosition));
    com.uni_wuppertal.iad.vierteltour.ui.map.MapsActivity.adapter.notifyDataSetChanged();
    drawRoutes();
}