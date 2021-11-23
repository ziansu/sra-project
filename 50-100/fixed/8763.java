@java.lang.Override
public void create() {
    ru.spbau.kaysin.ants.Ants.generator = new com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator(Gdx.files.internal("FONTS/visitor1.ttf"));
    ru.spbau.kaysin.ants.Ants.assets.load("pack.txt", com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
    ru.spbau.kaysin.ants.Ants.assets.load("explosion.txt", com.badlogic.gdx.graphics.g2d.TextureAtlas.class);
    ru.spbau.kaysin.ants.Ants.assets.finishLoading();
    ru.spbau.kaysin.ants.Ants.assets.update();
    aurelienribon.tweenengine.Tween.registerAccessor(com.badlogic.gdx.scenes.scene2d.Actor.class, new ru.spbau.kaysin.ants.utils.TweenActor());
    setScreen(new ru.spbau.kaysin.ants.screens.MenuScreen());
}