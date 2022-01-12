public void syncWithModelRepository(float deltaTime) {
    executeCommands(commands, deltaTime);
    commands.clear();
    com.bigcustard.blurp.core.BlurpStore.syncSingletons();
    runtimeImageSprites.syncAll(BlurpStore.modelRepository.getImageSprites());
    runtimeAnimationSprites.syncAll(BlurpStore.modelRepository.getAnimationSprites());
    runtimeTextSprites.syncAll(BlurpStore.modelRepository.getTextSprites());
    for (com.bigcustard.blurp.core.Sprite modelSprite : BlurpStore.modelRepository.pullCreatedSprites()) {
        BlurpStore.blurpScreen.addActor(getSprite(modelSprite));
    }
    executeCommands(deferredCommands, deltaTime);
    deferredCommands.clear();
}