private com.mapswithme.maps.widget.WheelProgressView getWheel() {
    if ((mItemsFrame) == null)
        return null;
    
    android.view.View frame = mItemsFrame.getChildAt(0);
    com.mapswithme.maps.widget.WheelProgressView res = ((com.mapswithme.maps.widget.WheelProgressView) (frame.findViewById(R.id.progress)));
    return (res != null) && (com.mapswithme.util.UiUtils.isVisible(res)) ? res : null;
}