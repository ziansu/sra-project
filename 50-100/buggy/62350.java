public void replaceGlycolSystemName(java.lang.String name, int index) {
    java.lang.String oldName = this.glycolSystemNames.get(index);
    Creator.Circuit oldSubNames;
    if (this.glycolSystemNames.contains(oldName)) {
        oldSubNames = this.glycolSubSystems.remove(oldName);
    }else {
        oldSubNames = new Creator.Circuit(name);
    }
    this.glycolSystemNames.set(index, name);
    oldSubNames.updateNames(name);
    this.glycolSubSystems.put(name, oldSubNames);
}