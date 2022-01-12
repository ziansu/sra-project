@java.lang.Override
public void onInit(org.gearvrf.GVRContext gvrContext) throws java.lang.Throwable {
    scene = gvrContext.getMainScene();
    objects = new java.util.ArrayList<>();
    for (int i = 0; i < (m360Image.length); i++) {
        objects.add(i, createObject(gvrContext, i));
    }
    scene.addSceneObject(objects.get(currentImage));
}