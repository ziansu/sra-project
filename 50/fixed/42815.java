public void addChild(edu.virginia.engine.display.DisplayObject d) {
    children.add(d);
    if (d != null) {
        d.setParent(this);
    }
}