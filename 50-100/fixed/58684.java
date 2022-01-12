private android.widget.PopupWindow resultWindow(android.view.View view) {
    final android.widget.PopupWindow popWindow = new android.widget.PopupWindow(view, 400, ViewGroup.LayoutParams.WRAP_CONTENT);
    popWindow.setOutsideTouchable(true);
    popWindow.setTouchable(true);
    popWindow.setTouchInterceptor(new android.view.View.OnTouchListener() {
        @java.lang.Override
        public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
            return false;
        }
    });
    popWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(286331153));
    popWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
    return popWindow;
}