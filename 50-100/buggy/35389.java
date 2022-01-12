private double calcColor(Pixel center, Image image) {
    java.util.List<Pixel> omega = getPixelsInWindow(center, image);
    double normal = calcSum(center, omega, 1, image);
    double summation = calcSum(center, omega, image.getColor(center), image);
    return summation / normal;
}