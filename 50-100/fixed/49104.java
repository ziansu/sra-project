private void decrementToMarkedOrZero() {
    do {
        currentStep().before(context);
        current -= 1;
    } while (((current()) > 0) && (!(currentIsMarked())) );
    if ((current()) < 0)
        current = 0;
    
    if ((current()) == 0) {
        currentStep().before(context);
    }
    state = PlayState.Before;
}