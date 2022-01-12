@java.lang.Override
public void flush(hcm.ssj.core.stream.Stream[] stream_in) {
    _series.clear();
    android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            _view.removeAllSeries();
            _view.clearSecondScale();
        }
    }, 1);
}