private android.graphics.Bitmap SepiaColor(android.graphics.Bitmap original) {
    android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
    colorMatrix.setSaturation(0);
    android.graphics.ColorMatrix colorScale = new android.graphics.ColorMatrix();
    colorScale.setScale(1, 1, 0.8F, 1);
    colorMatrix.postConcat(colorScale);
    return this.process(original, colorMatrix);
}