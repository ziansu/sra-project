public void replaceGlycolSystemName(java.lang.String name, int index) {
    java.lang.String oldName = this.glycolSystemNames.get(index);
    Creator.Circuit oldSubNames = null;
    if (this.glycolSystemNames.contains(oldName)) {
        oldSubNames = this.glycolSubSystems.remove(oldName);
    }
    if (oldSubNames == null) {
        oldSubNames = new Creator.Circuit(name);
    }
    this.glycolSystemNames.set(index, name);
    oldSubNames.updateNames(name);
    this.glycolSubSystems.put(name, oldSubNames);
}