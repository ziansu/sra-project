void keepState(boolean state) {
    if (state) {
        changeToActive();
    }else {
        changeToInactive();
    }
}