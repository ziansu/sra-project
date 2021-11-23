@java.lang.Override
public void run() {
    android.util.Log.d(gov.nasa.jpl.hi.marsimages.MarsImagesApp.TAG, "Adding image quads to scene");
    for (gov.nasa.jpl.hi.marsimages.ui.MarsMosaicRenderer.QuadInitializer i : initializers) {
        gov.nasa.jpl.hi.marsimages.models.ImageQuad quad = new gov.nasa.jpl.hi.marsimages.models.ImageQuad(i.model, qLL, i.imageId);
        if (!(hasChild(quad))) {
            quad.setDrawingMode(android.opengl.GLES20.GL_LINE_LOOP);
            quad.setMaterial(yellowMaterial);
            quad.addLight(mLight);
            addChild(quad);
            photoQuads.put(i.photoTitle, quad);
        }
    }
}