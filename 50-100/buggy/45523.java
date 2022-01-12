public void checkAssetLoaded(net.jodah.concurrentunit.Waiter waiter, java.lang.String name, int numTex) {
    mWaiter.assertEquals(1, ModelsLoaded);
    mWaiter.assertEquals(0, ModelErrors);
    mWaiter.assertEquals(numTex, TexturesLoaded);
    if (name != null) {
        mWaiter.assertNotNull(mScene.getSceneObjectByName(name));
    }
    mWaiter.resume();
}