private void checkForPlaceTokenAnimation() {
    if (tokenPlaceAnimationIsNotRunning()) {
        if (playFieldHandler.isPlayFieldFull()) {
            playFieldHandler.resetTokenList();
            playFieldHandler.resetColumns();
            playFieldHandler.disablePlayFieldIsFull();
        }
        placeToken();
    }
}