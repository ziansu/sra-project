@java.lang.Override
protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    realWidth = cn.com.jinrizhushi.stock.util.customstockview.MeasureSpec.getSize(widthMeasureSpec);
    realHeight = cn.com.jinrizhushi.stock.util.customstockview.MeasureSpec.getSize(heightMeasureSpec);
    ordinateData = getOrdinateData();
    abscissaData = getAbscissaData();
    listKline = getListKline();
    initPoint();
}