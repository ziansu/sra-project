private float computePercentage() {
    if ((direction) == 1) {
        currentTime += Gdx.graphics.getDeltaTime();
        if ((currentTime) > (ANIMATION_LENGTH)) {
            currentTime = ANIMATION_LENGTH;
            direction *= -1;
        }
    }else {
        currentTime -= Gdx.graphics.getDeltaTime();
        if ((currentTime) < 0) {
            currentTime = 0;
            direction *= -1;
        }
    }
    return (currentTime) / (ANIMATION_LENGTH);
}