public java.util.List<org.andresoviedo.app.model3D.model.Object3DData> getObjects() {
    synchronized(objects) {
        return new java.util.ArrayList<org.andresoviedo.app.model3D.model.Object3DData>(objects);
    }
}