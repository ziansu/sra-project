private void setValueContrained(int x) {
    x = x - (this.getAbsoluteLeft());
    int width = sliderWidget.getOffsetWidth();
    if (x < 0) {
        x = 0;
    }
    if (x > (width - 1)) {
        x = width - 1;
    }
    int componentValue = (x * (max)) / width;
    setValue(componentValue, true, false);
    sliderWidget.setPos(x);
}