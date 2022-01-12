private android.graphics.Bitmap ContrastBrightness(android.graphics.Bitmap original, float C, float B) {
    android.graphics.ColorMatrix Cmat = new android.graphics.ColorMatrix(new float[]{ C , 0 , 0 , 0 , B , 0 , C , 0 , 0 , B , 0 , 0 , C , 0 , B , 0 , 0 , 0 , 1 , 0 });
    return this.process(original, Cmat);
}