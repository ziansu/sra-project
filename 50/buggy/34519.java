private android.graphics.Bitmap GrayscaleColor(android.graphics.Bitmap original) {
    android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
    colorMatrix.setSaturation(0);
    return this.process(original, colorMatrix);
}