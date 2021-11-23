@java.lang.Override
public void onSizeChanged(int placeHoderHeight, int stickHeight) {
    this.placeHoderHeight = placeHoderHeight;
    for (int i = 0; i < (placeHoderHeaderLayoutList.size()); i++) {
        if ((placeHoderHeaderLayoutList.get(i)) != null) {
            placeHoderHeaderLayoutList.get(i).updatePlaceHeight(placeHoderHeight, this, placeHoderHeaderLayoutList.indexOfValue(placeHoderHeaderLayoutList.get(i)));
        }
    }
}