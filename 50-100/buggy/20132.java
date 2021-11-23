public void showFloatingBall() {
    floatBall = new android.widget.ImageView(mContext);
    floatBall.setImageResource(R.drawable.floating2);
    final android.view.WindowManager.LayoutParams params = new android.view.WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.TYPE_SYSTEM_ALERT, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, android.graphics.PixelFormat.TRANSLUCENT);
    params.gravity = (android.view.Gravity.TOP) | (android.view.Gravity.RIGHT);
    mWindowManager.addView(floatBall, params);
    floatBall.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            removeFloatingView();
            showPopupWindow();
        }
    });
}