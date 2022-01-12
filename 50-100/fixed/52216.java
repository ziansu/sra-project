@java.lang.Override
public void onUIPositionChange(in.srain.cube.views.ptr.PtrFrameLayout frame, boolean isUnderTouch, byte status, in.srain.cube.views.ptr.indicator.PtrIndicator ptrIndicator) {
    float factor = ((float) (45)) / (mHeight);
    mHeader.rotate((((ptrIndicator.getCurrentPosY()) * factor) > 45 ? 45 : (ptrIndicator.getCurrentPosY()) * factor));
}