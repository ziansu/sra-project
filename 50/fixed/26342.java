public void fillList() {
    listModel.clear();
    for (java.lang.String classTitle : classes.keySet()) {
        listModel.addElement(classTitle);
    }
}