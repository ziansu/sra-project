private void stopPlayerVelocityWhenBothDirectionsNotPressed(game.GameObject gameObject) {
    if (isUpNorDownPressed())
        gameObject.setVelocityY(0);
    
    if (isLeftNorRightPressed())
        gameObject.setVelocityX(0);
    
}