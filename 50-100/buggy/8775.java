private void setValueContrained(int x) {
    x = x - (this.getAbsoluteLeft());
    int width = sliderWidget.getOffsetWidth();
    if (x < 0) {
        x = 0;
    }
    if (x > width) {
        x = width;
    }
    int componentValue = (x * (max)) / width;
    setValue(componentValue, true, false);
    sliderWidget.setPos(x);
}