public void init() {
    if ((mBitmap) == null) {
        return ;
    }
    initVertexData();
    initShader();
    initTexture();
    isInited = true;
}