public void setResolution(int resolution) {
    if ((getWidth()) > 0) {
        heightResolution = (resolution * (getHeight())) / (getWidth());
        widthResolution = resolution;
    }
}