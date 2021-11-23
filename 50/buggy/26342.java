public void fillList() {
    try {
        listModel.clear();
    } catch (java.lang.Exception e) {
    }
    for (java.lang.String classTitle : classes.keySet()) {
        listModel.addElement(classTitle);
        java.lang.System.out.println("Filled list");
    }
}