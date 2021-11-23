private static void init() {
    java.lang.ref.WeakReference<grimhaus.com.G2Dj.Type.Engine.Scene> mainScene = grimhaus.com.G2Dj.Engine.createScene("Main");
    Adhoc.Main.createVisibleGeometry(mainScene);
    Adhoc.Main.createCollisionGeometry(mainScene);
    Adhoc.Main.createTextMeshTest(mainScene);
    Adhoc.Main.createSomeDynamicBoxes(mainScene);
    Adhoc.Main.createPlayerCamera(mainScene);
}