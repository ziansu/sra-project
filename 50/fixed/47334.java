@java.lang.Override
public void updateHeight() {
    height = 0;
    for (net.yawk.client.gui.AbstractComponent component : components) {
        component.setY(height);
        height += component.getHeight();
    }
}