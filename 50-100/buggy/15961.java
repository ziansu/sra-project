@java.lang.Override
public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    int widthMode = com.db.chart.view.MeasureSpec.getMode(widthMeasureSpec);
    int heightMode = com.db.chart.view.MeasureSpec.getMode(heightMeasureSpec);
    int tmpWidth = widthMeasureSpec;
    int tmpHeight = heightMeasureSpec;
    if (widthMode == (MeasureSpec.AT_MOST))
        tmpWidth = 200;
    
    if (heightMode == (MeasureSpec.AT_MOST))
        tmpHeight = 100;
    
    setMeasuredDimension(tmpWidth, tmpHeight);
}