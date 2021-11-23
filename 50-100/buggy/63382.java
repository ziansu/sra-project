@com.vertextrigger.entities.player.Test
public void givenSpriteFacingRightWhenPlayerMovingLeftThenSpriteShouldFlipLeft() {
    when(sprite.isFlipX()).thenReturn(false);
    animator.setHorizontalMovement(movingLeft);
    animator.getUpdatedSprite(delta, angle, position);
    verify(sprite).flip(true, false);
}