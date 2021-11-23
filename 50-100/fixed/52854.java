public void init(android.content.Context context) {
    android.view.SurfaceHolder holder = getHolder();
    holder.addCallback(this);
    thread = new org.urobot.controller.CamView.MultipartJpegViewThread(holder, context);
    setFocusable(true);
    overlayPaint = new android.graphics.Paint();
    overlayPaint.setTextAlign(Paint.Align.LEFT);
    overlayPaint.setTextSize(12);
    overlayPaint.setTypeface(Typeface.DEFAULT);
    overlayTextColor = android.graphics.Color.WHITE;
    overlayBackgroundColor = android.graphics.Color.BLACK;
    ovlPos = org.urobot.controller.CamView.POSITION_LOWER_RIGHT;
    displayMode = org.urobot.controller.CamView.SIZE_STANDARD;
    dispWidth = getWidth();
    dispHeight = getHeight();
}