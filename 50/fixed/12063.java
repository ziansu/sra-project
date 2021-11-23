@java.lang.Override
public void onDrawFrame(float frameTime) {
    mFrameTime += frameTime;
    if (mIsProcessing) {
        return ;
    }
    mIsProcessing = true;
    org.gearvrf.physics.NativePhysics3DWorld.step(getNative(), mFrameTime);
    generateCollisionEvents();
    mFrameTime = 0.0F;
    mIsProcessing = false;
}