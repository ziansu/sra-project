private void changeBrightness(int bVal) {
    if (bVal == 999) {
    }else {
        bVal = bVal * 2;
        if (bVal < 0)
            bVal = 0;
        else
            if (bVal > 255)
                bVal = 255;
            
        
        android.util.Log.d("bval", ("" + bVal));
        android.content.ContentResolver cResolver = this.getApplicationContext().getContentResolver();
        Settings.System.putInt(cResolver, Settings.System.SCREEN_BRIGHTNESS, bVal);
    }
}