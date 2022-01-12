private void getModeFromIntent() {
    android.content.Intent intent = getIntent();
    android.os.Bundle bundle = intent.getExtras();
    myMode = intent.getStringExtra("MODE");
    if ((myMode) == "-21 dB")
        attenuator = 1;
    else
        if ((myMode) == "LNA on")
            attenuator = 3;
        else
            if ((myMode) == "normal mode")
                attenuator = 0;
            else
                if ((myMode) == "-42 dB")
                    attenuator = 2;
                
            
        
    
}