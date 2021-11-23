public void destroyBug(com.badlogic.ashley.core.Entity bugE) {
    if (!(bugE.getComponent(com.fd.etf.entity.componets.BugComponent.class).isAngeredBee)) {
        spawnBugJuiceBubble(bugE.getComponent(com.fd.etf.entity.componets.BugComponent.class));
        com.fd.etf.utils.BugPool.getInstance(gameStage).release(bugE);
        if (bugE.getComponent(com.uwsoft.editor.renderer.components.sprite.SpriteAnimationComponent.class).frameRangeMap.containsKey("fly")) {
            canPlayAnimation = true;
            setAnimation("fly", Animation.PlayMode.LOOP, bugE.getComponent(com.uwsoft.editor.renderer.components.sprite.SpriteAnimationStateComponent.class), bugE.getComponent(com.uwsoft.editor.renderer.components.sprite.SpriteAnimationComponent.class));
        }
    }
}