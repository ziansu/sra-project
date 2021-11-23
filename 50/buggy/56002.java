@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    com.prolificinteractive.materialcalendarview.CalendarUtils.logd("CPV.onDraw", getFirstViewDay());
    canvas.drawColor(Color.YELLOW);
}