public void addToIgnoreList(java.lang.String value) {
    if ((_ignored.contains(value)) == false) {
        _ignored.add(value);
        notifyListerners_propertyUpdate();
    }
}