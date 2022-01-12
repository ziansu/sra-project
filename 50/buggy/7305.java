public void addChild(kz.pvnhome.pvnt.File child) {
    child.setParent(child);
    children.add(child);
}