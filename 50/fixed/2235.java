public float getAlpha() {
    float alpha = (com.badlogic.gdx.utils.TimeUtils.timeSinceMillis(lastPacketTime)) / 40.0F;
    return com.badlogic.gdx.math.MathUtils.clamp(alpha, 0.0F, 1.0F);
}