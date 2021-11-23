@java.lang.Override
public void run() {
    if (picture != null) {
        if ((mapLayer) == null) {
            mapLayer = new com.onlylemi.mapview.library.layer.MapLayer(this);
            layers.add(mapLayer);
        }
        mapLayer.setImage(picture);
        if ((mapViewListener) != null) {
            mapViewListener.onMapLoadSuccess();
        }
        isMapLoadFinish = true;
        refresh();
    }else {
        if ((mapViewListener) != null) {
            mapViewListener.onMapLoadFail();
        }
    }
}