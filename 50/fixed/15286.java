public void addChild(engine.core.GameObject child) {
    child.setApplication(application);
    child.parent = this;
    child.transform.setParent(transform);
    children.add(child);
}