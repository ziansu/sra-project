public double mapLongitude(double longitude) {
    double y = (((paintingCanvas.getWidth()) - 0) / ((content.getMaxLongitude()) - (content.getMinLongitude()))) * (longitude - (content.getMinLongitude()));
    return y;
}