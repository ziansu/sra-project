@java.lang.Override
public void onRefresh() {
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            data.clear();
            index = 1;
            getData(index);
        }
    }, 2000);
}