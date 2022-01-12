public void getSettingsFromIntent() {
    android.content.Intent intent = getIntent();
    myMode = intent.getStringExtra("myMode");
    if ((myMode) == "-21 dB")
        attenuator = 1;
    else
        if ((myMode) == "LNA on")
            attenuator = 3;
        else
            if ((myMode) == "normal mode")
                attenuator = 0;
            else
                attenuator = 2;
            
        
    
    freq = intent.getIntExtra("frequency", 0);
    android.util.Log.d("Timeline freq", java.lang.String.valueOf(freq));
    modeMaxSize();
}