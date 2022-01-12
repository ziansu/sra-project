@java.lang.Override
protected void onResume() {
    super.onResume();
    getSupportActionBar().hide();
    if (((!(flagMenuPictures)) && (!(flagMenuRating))) && (!(flagMenuSounds)))
        onMainMenu();
    else {
        if (flagMenuSounds)
            onSoundMenu();
        
        if (flagMenuPictures)
            onCameraMenu();
        
        if (flagMenuRating)
            onRatingMenu();
        
    }
}