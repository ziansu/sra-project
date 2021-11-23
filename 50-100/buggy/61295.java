public double calcVolumeOfBox(double length, double width, double height) {
    if ((length < 0) || (length > 6)) {
        return -1;
    }
    if ((width < 0) || (width > 6)) {
        return -1;
    }
    if ((height < 0) || (height > 6)) {
        return -1;
    }
    double volume = (length * width) * height;
    return volume;
}