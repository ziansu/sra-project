public void dropIn(android.view.View view) {
    android.widget.ImageView counter = ((android.widget.ImageView) (view));
    int tappedFieldNumber = getTappedCounterNumber(counter);
    if (isFieldFree(tappedFieldNumber)) {
        boardState[tappedFieldNumber] = activePlayer;
        counter.setTranslationY((-1000.0F));
        if (isRedPlayerActive()) {
            useRedCounter(counter);
        }else
            if (isBluePlayerActive()) {
                useBlueCounter(counter);
            }
        
    }
    animateCounterDroppingDown(counter);
}