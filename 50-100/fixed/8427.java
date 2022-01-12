@java.lang.Override
protected void onResume() {
    super.onResume();
    getSupportActionBar().hide();
    if ((!(flagMenuPictures)) && (!(flagMenuSounds)))
        onMainMenu();
    else {
        if (flagMenuSounds)
            onSoundMenu();
        
        if (flagMenuPictures)
            onCameraMenu();
        
    }
}