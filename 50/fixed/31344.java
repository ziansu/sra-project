@java.lang.Override
public boolean onClusterItemClick(com.whiterabbit.pisabike.screens.map.MapItem mapItem) {
    mPresenter.onStationClicked(mapItem.getStation().getName());
    return true;
}