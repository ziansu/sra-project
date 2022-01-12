private android.graphics.Bitmap ChannelMixer(android.graphics.Bitmap original, float R, float G, float B) {
    android.graphics.ColorMatrix Cmat = new android.graphics.ColorMatrix(new float[]{ R , 0 , 0 , 0 , 0 , 0 , G , 0 , 0 , 0 , 0 , 0 , B , 0 , 0 , 0 , 0 , 0 , 1 , 0 });
    return this.process(original, Cmat);
}