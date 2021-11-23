public void addToIgnoreList(java.lang.String value) {
    if ((_ignored.contains(value)) == false) {
        _ignored.add(new java.io.File(value));
        notifyListerners_propertyUpdate();
    }
}