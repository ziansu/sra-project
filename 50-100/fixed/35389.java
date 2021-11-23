private double calcColor(Pixel center, Image image) {
    java.util.List<Pixel> omega = getPixelsInWindow(center, image);
    double normal = calcSum(image, center, omega, false);
    double summation = calcSum(image, center, omega, true);
    return summation / normal;
}