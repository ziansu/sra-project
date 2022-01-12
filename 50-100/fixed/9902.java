@java.lang.Override
public void onMeasure(int widthSpec, int heightSpec) {
    super.onMeasure(widthSpec, heightSpec);
    if ((pullView) != null) {
        pullView.measure(widthSpec, 0);
        setMeasuredDimension(getMeasuredWidth(), ((getMeasuredHeight()) + (pullView.getMeasuredHeight())));
    }
}