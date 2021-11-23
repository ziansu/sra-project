@java.lang.Override
public boolean onClusterItemClick(com.whiterabbit.pisabike.screens.map.MapItem mapItem) {
    android.util.Log.d("MAP", ((mapItem.getTitle()) + "cliccked"));
    mPresenter.onStationClicked(mapItem.getStation().getName());
    return true;
}