@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    clearScreen(canvas);
    if (!(init)) {
        postInvalidateDelayed(50);
        android.util.Log.e(me.itsrishi.exercisecounter.views.StatsView.TAG, "Data not set");
        return ;
    }
    drawGraph(canvas);
}