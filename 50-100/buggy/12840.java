@java.lang.Override
public void onOpen(java.lang.Object arg0) {
    super.onOpen(arg0);
    android.view.View.OnTouchListener listener = new android.view.View.OnTouchListener() {
        public boolean onTouch(android.view.View v, android.view.MotionEvent e) {
            if ((e.getAction()) == 1) {
                marker.setHasToClose(false);
                marker.maximize();
            }
            return true;
        }
    };
    this.mView.setOnTouchListener(listener);
    this.mView.findViewById(R.id.maximize).setOnTouchListener(listener);
}