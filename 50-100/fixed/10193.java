public ui.Resizer.Size resize(int width, int height) {
    double wRatio = (1.0 * (this.width)) / width;
    double hRatio = (1.0 * (this.height)) / height;
    return hRatio < wRatio ? new ui.Resizer.Size(((int) (width * hRatio)), ((int) (height * hRatio))) : new ui.Resizer.Size(((int) (width * wRatio)), ((int) (height * wRatio)));
}