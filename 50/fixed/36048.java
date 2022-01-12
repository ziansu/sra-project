private void checkForPlaceTokenAnimation() {
    if ((tokenPlaceAnimationIsNotRunning()) && (!(playFieldHandler.isPlayFieldFull()))) {
        placeToken();
    }
}