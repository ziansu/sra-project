private float computePercentage() {
    if ((direction) == 1)
        currentTime += Gdx.graphics.getDeltaTime();
    else
        currentTime -= Gdx.graphics.getDeltaTime();
    
    if (((currentTime) >= (ANIMATION_LENGTH)) || ((currentTime) <= 0))
        direction *= -1;
    
    return (currentTime) / (ANIMATION_LENGTH);
}