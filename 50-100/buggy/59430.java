public void register(java.lang.String name, com.badlogic.gdx.graphics.Texture texture, int n_columns, int n_rows, float time_per_frame) {
    com.badlogic.gdx.graphics.g2d.TextureRegion[][] spriteFrames = com.badlogic.gdx.graphics.g2d.TextureRegion.split(texture, ((texture.getWidth()) / n_columns), ((texture.getHeight()) / n_rows));
    com.badlogic.gdx.graphics.g2d.TextureRegion[] firstAnimation = spriteFrames[0];
    com.badlogic.gdx.graphics.g2d.Animation anim = new com.badlogic.gdx.graphics.g2d.Animation(time_per_frame, firstAnimation);
    anim.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);
    register("idle", anim);
}