public boolean update() {
    if (Gdx.input.justTouched()) {
        float x = Gdx.input.getX();
        float y = Gdx.input.getY();
        if (isActorTouched(returnButton, x, y)) {
            isReturnButtonTouched = true;
            return true;
        }
        if (isActorTouched(startWaveButton, x, y)) {
            isStartWaveButtonTouched = true;
            return true;
        }
    }
    return false;
}