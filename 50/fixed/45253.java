public void removeSelectedObject() {
    if ((activeObject) != null) {
        removeObject(activeObject);
    }
    activeObject = null;
}