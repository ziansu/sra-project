public in.tamchow.fractal.imgutils.containers.ImageData subImage(int x_res, int y_res) {
    in.tamchow.fractal.imgutils.containers.ImageData subImage = new in.tamchow.fractal.imgutils.containers.ImageData(this);
    subImage.pan(x_res, y_res, 0, 0);
    return subImage;
}