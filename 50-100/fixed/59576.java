public void setName(java.lang.String newName) {
    if ((names) == null) {
        names = new java.util.ArrayList<java.lang.String>();
    }
    if ((names.size()) > 0) {
        names.set(0, newName);
    }else {
        names.add(newName);
    }
}