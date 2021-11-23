public cn.ieclipse.af.graphics.RoundedColorDrawable addStateColor(int[] stateSet, int color, int borderColor) {
    if ((sld) == null) {
        sld = new android.graphics.drawable.StateListDrawable();
    }
    cn.ieclipse.af.graphics.RoundedColorDrawable self = new cn.ieclipse.af.graphics.RoundedColorDrawable(mRadii, color);
    self.setCircle(this.mIsCircle);
    self.setBorder((borderColor > 0 ? borderColor : mBorderColor), mBorderWidth);
    sld.addState(stateSet, self);
    return this;
}