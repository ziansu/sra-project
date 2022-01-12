@java.lang.Override
public void preFirstRender(com.github.rskupnik.storyteller.statefulobjects.StatefulStage stage) {
    com.github.rskupnik.storyteller.structs.backgrounds.Background background = backgrounds.current(stage);
    if (background instanceof com.github.rskupnik.storyteller.structs.backgrounds.BasicBackground) {
        com.badlogic.gdx.graphics.Color c = ((com.github.rskupnik.storyteller.structs.backgrounds.BasicBackground) (background)).getPostPublishColor();
        aurelienribon.tweenengine.Tween.to(background.getTint(), ColorAccessor.ALPHA, 1).target(c.a).start(tweenManager);
    }
}