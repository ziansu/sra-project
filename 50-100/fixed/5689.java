public void addChild(com.googlecode.openbox.testu.tester.TestCase child) {
    if (null == child) {
        return ;
    }
    if (children.contains(child)) {
        return ;
    }
    if ((child.getParent()) != null) {
        child.getParent().getChildren().remove(child);
    }
    child.setParent(this);
    child.grow();
    this.children.add(child);
}