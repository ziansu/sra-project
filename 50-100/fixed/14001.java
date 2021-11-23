@com.vertextrigger.entities.player.Test
public void givenSpriteFacingLeftWhenPlayerIsMovingLeftThenSpriteShouldNotFlipRight() {
    when(sprite.isFlipX()).thenReturn(true);
    animator.setHorizontalMovement(movingLeft);
    animator.getUpdatedSprite(delta, position, angle);
    verify(sprite, never()).flip(true, false);
}