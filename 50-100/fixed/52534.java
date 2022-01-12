public double mapLongitude(double longitude) {
    double x = (paintingCanvas.getWidth()) * ((longitude - (content.getMinLongitude())) / ((content.getMaxLongitude()) - (content.getMinLongitude())));
    return x;
}