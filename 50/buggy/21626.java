public static com.badlogic.gdx.graphics.g2d.Animation createFlippedAnimation(com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion> refRegions, float frameTime, com.badlogic.gdx.graphics.g2d.Animation.PlayMode playMode) {
    com.badlogic.gdx.graphics.g2d.Animation newAnimation = new com.badlogic.gdx.graphics.g2d.Animation(frameTime, com.esbjon.utilities.TextureHandler.flippedRegions(refRegions));
    newAnimation.setPlayMode(playMode);
    return newAnimation;
}