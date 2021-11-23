public void mapButtonAction(java.lang.String group, java.lang.String name, int key) {
    this.bStore = app.getDetectorView().bStore;
    if (!(bStore.containsKey(group))) {
        bStore.put(group, key);
    }else {
        bStore.replace(group, key);
    }
    omap = key;
    if ((key > 10) && (key < 14))
        app.viewIndex = key - 10;
    
    app.getDetectorView().getView().updateGUI();
}