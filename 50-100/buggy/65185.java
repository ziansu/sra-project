public void startInteract(com.sidescroller.player.Player player) {
    hasTriggered = !(hasTriggered);
    if ((shape.getRubeSprites()) != null) {
        com.badlogic.gdx.utils.Array<com.sidescroller.objects.RubeSprite> rubeSprites = shape.getRubeSprites();
        for (com.sidescroller.objects.RubeSprite rubeSprite : rubeSprites) {
            rubeSprite.getSprite().flip(true, false);
        }
    }
}