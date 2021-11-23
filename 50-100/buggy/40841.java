public void SetBackgroundResizable(android.view.View tv) {
    android.graphics.drawable.BitmapDrawable background = ((android.graphics.drawable.BitmapDrawable) (tv.getBackground()));
    android.graphics.drawable.BitmapDrawable newBackground = new android.graphics.drawable.BitmapDrawable(background.getBitmap()) {
        @java.lang.Override
        public int getMinimumWidth() {
            return 0;
        }

        @java.lang.Override
        public int getMinimumHeight() {
            return 0;
        }
    };
    newBackground.setTileModeXY(background.getTileModeX(), background.getTileModeY());
    tv.setBackgroundDrawable(newBackground);
}