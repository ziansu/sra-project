private void onThreadWait() {
    try {
        synchronized(this) {
            android.util.Log.d(com.rustfisher.fisherandroidchart.MultiLinesChartSView.TAG, "DrawThread waiting");
            this.wait();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}