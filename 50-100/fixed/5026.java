protected void setStateFromIntent(android.content.Intent intent) {
    if (intent == null)
        return ;
    
    android.os.Bundle extras = intent.getExtras();
    currentState.mode = extras.getInt("mode");
    currentState.data = extras.getParcelable("data");
    currentState.image = currentState.data.getImage().loadFullSizeImage();
}