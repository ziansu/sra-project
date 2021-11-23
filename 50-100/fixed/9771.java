private void ToggleCircleColor(com.google.android.gms.maps.model.Circle circle) {
    int strokeColor = (circle.getStrokeColor()) ^ 52224;
    circle.setStrokeColor(strokeColor);
    circle.setStrokeWidth(((circle.getStrokeWidth()) == 3 ? 6 : 3));
}