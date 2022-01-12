@java.lang.Override
public void updateCurrentScore() {
    platformDifference = (currentEPlatformPosition) - (newEPlatformPosition);
    if ((platformDifference) != 0) {
        if ((platformDifference) < 0) {
            setCurrentScore(((getCurrentScore()) - (platformDifference)));
        }else
            if ((platformDifference) > 0) {
                setCurrentScore(((getCurrentScore()) + (platformDifference)));
            }
        
        newEPlatformPosition = player1Sprite.geteMapPosition().getY();
        currentEPlatformPosition = newEPlatformPosition;
    }
    updateGameScreenCurrentScore();
}