public void addComponent(net.yawk.client.gui.AbstractComponent c) {
    components.add(c);
    c.setRectangle(this);
    c.init();
    updateHeight();
}