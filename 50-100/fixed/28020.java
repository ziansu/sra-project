public android.graphics.Bitmap invert(android.graphics.Bitmap original) {
    android.graphics.ColorMatrix Cmat = new android.graphics.ColorMatrix(new float[]{ -1 , 0 , 0 , 0 , 255 , 0 , -1 , 0 , 0 , 255 , 0 , 0 , -1 , 0 , 255 , 0 , 0 , 0 , 1 , 0 });
    return this.process(original, Cmat);
}