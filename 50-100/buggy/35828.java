@java.lang.Override
public void preSceneDraw() {
    final float eyeX = 0.0F;
    final float eyeY = 0.0F;
    final float eyeZ = 1.5F;
    final float lookX = 0.0F;
    final float lookY = 0.0F;
    final float lookZ = -5.0F;
    final float upX = 0.0F;
    final float upY = 1.0F;
    final float upZ = 0.0F;
    mScene.setLookAt(eyeX, eyeY, eyeZ, lookX, lookY, lookZ, upX, upY, upZ);
}