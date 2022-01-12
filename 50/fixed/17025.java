@com.vertextrigger.entities.player.Test
public void whenPlayerUpdatedDeltaIsAddedToFrame() {
    animator.getUpdatedSprite(delta, position, angle);
    verify(animation).getKeyFrame(delta);
}