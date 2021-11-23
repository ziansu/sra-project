@java.lang.Override
public void onStart() {
    super.onStart();
    org.cocos2d.nodes.CCDirector.sharedDirector().attachInView(_glSurfaceView);
    org.cocos2d.nodes.CCDirector.sharedDirector().setDisplayFPS(true);
    org.cocos2d.nodes.CCDirector.sharedDirector().setAnimationInterval((1.0F / 60.0F));
    try {
        java.lang.System.out.println("creating MenuLayer...");
        org.cocos2d.layers.CCScene scene = de.piraten.superherbert.MenuLayer.scene(this);
        org.cocos2d.nodes.CCDirector.sharedDirector().runWithScene(scene);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Exception in startactivity.scenestuff");
        e.printStackTrace();
    }
}