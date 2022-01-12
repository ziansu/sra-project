@com.facebook.react.uimanager.annotations.ReactProp(name = io.mezon.rnslider.RNSliderViewManager.PROP_MAX)
public void setMax(android.widget.FrameLayout view, int max) {
    if ((view.getChildCount()) == 0) {
        throw new java.lang.IllegalStateException("Slider not yet created");
    }
    io.mezon.rnslider.RNSlider slider = ((io.mezon.rnslider.RNSlider) (view.getChildAt(0)));
    slider.setMax(max);
}