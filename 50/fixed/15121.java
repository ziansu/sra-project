public <T extends net.shadowfacts.shadowmc.gui.AbstractGUI> T addChild(T child) {
    child.parent = this;
    children.add(child);
    return child;
}