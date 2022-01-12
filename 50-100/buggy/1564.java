public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    org.mix.common.BaseActivity.log((((("surfaceChanged(" + (java.lang.String.valueOf(width))) + ",") + (java.lang.String.valueOf(height))) + ")"));
    org.mix.common.BaseActivity.NativeCode.handleFrontendEvent(org.mix.common.BaseActivity.NativeFrontendEvent.Resized.ordinal(), ((float) (width)), ((float) (height)));
}