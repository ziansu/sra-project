public void resetObject(final com.mozidev.testopengl.Base3DObject object) {
    android.util.Log.d(com.mozidev.testopengl.MyGLRenderer.TAG, "resetObject");
    if (object != null) {
        m3DObject = new com.mozidev.testopengl.Base3DObject(object);
        createFigure();
        createMarkers();
    }
}