public void mapButtonAction(java.lang.String group, java.lang.String name, int key) {
    this.bStore = app.getDetectorView().bStore;
    if (!(bStore.containsKey(group))) {
        bStore.put(group, key);
    }else {
        bStore.replace(group, key);
    }
    omap = key;
    app.getDetectorView().update();
}