@java.lang.Override
public void update(float delta) {
    elapsed += delta;
    runnable.pitch = ionium.util.MathHelper.lerp(init, end, com.badlogic.gdx.math.MathUtils.clamp(((elapsed) / (time)), 0.0F, 1.0F));
    Gdx.app.postRunnable(runnable);
}