@java.lang.Override
public void setUserVisibleHint(boolean isVisibleToUser) {
    super.setUserVisibleHint(isVisibleToUser);
    if (((mapView) == null) || ((mapboxMap) == null)) {
        return ;
    }
    updateLocationEnabled(mapboxMap);
}