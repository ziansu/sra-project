public static void handleTouchEvents(android.view.MotionEvent event, android.widget.ImageView button, com.doleh.Jukebox.Interfaces.IFunction touchHandler) {
    switch (event.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            {
                button.setColorFilter(1996488704, PorterDuff.Mode.SRC_ATOP);
                break;
            }
        case android.view.MotionEvent.ACTION_UP :
        case android.view.MotionEvent.ACTION_CANCEL :
            {
                touchHandler.execute(button);
                button.clearColorFilter();
                com.doleh.Jukebox.Static.Tracking.logTouch(button);
                break;
            }
    }
}