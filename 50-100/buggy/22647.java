public void startLongClickCheck(final int x, final int y) {
    if ((longClickHandler) == null) {
        longClickHandler = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                longClickChild(x, y);
            }
        };
    }
    postDelayed(longClickHandler, android.view.ViewConfiguration.get(getContext()).getLongPressTimeout());
}