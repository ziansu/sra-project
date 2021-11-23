private void changeBrightness(int bVal) {
    if (bVal == 999) {
    }else {
        if (bVal < 0)
            bVal = 0;
        else
            if (bVal > 255)
                bVal = 255;
            
        
        android.content.ContentResolver cResolver = this.getApplicationContext().getContentResolver();
        Settings.System.putInt(cResolver, Settings.System.SCREEN_BRIGHTNESS, bVal);
    }
}