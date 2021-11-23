@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    if (heightMeasureSpec != 0) {
        int sizeWidth = de.dmxcontrol.widget.MeasureSpec.getSize(widthMeasureSpec);
        int sizeHeight = de.dmxcontrol.widget.MeasureSpec.getSize(heightMeasureSpec);
        if ((sizeHeight < sizeWidth) && false) {
            heightMeasureSpec = de.dmxcontrol.widget.MeasureSpec.makeMeasureSpec(de.dmxcontrol.widget.MeasureSpec.getMode(heightMeasureSpec), sizeHeight);
        }
    }
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
}