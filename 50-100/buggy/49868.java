public br.com.mvbos.jeg.window.Camera config(int sceneWidth, int sceneHeight, int screenWidth, int screeHeight) {
    if ((sceneWidth + sceneHeight) < (screenWidth + screeHeight)) {
        throw new java.lang.IllegalArgumentException("The screen size is more larger than scene.");
    }
    this.w = sceneWidth;
    this.h = sceneHeight;
    this.scrw = ((short) (screenWidth));
    this.scrh = ((short) (screeHeight));
    cpx = cpy = 0;
    return this;
}