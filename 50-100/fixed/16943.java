public void setNightMode(boolean state) {
    nightMode = state;
    for (rearth.networking.UsageMarker marker : Elements) {
        if (marker == null) {
            break;
        }
        if (nightMode) {
            marker.setColor(nightColor);
        }else {
            marker.setColor(color);
        }
    }
    label.NightMode(state);
}