public boolean update(float x, float y) {
    if (isActorTouched(returnButton, x, y)) {
        isReturnButtonTouched = true;
        return true;
    }
    if (isActorTouched(startWaveButton, x, y)) {
        isStartWaveButtonTouched = true;
        return true;
    }
    return false;
}