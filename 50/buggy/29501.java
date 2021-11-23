@java.lang.Override
public int getHeight() {
    int h = 0;
    for (net.yawk.client.gui.AbstractComponent c : components) {
        h += c.getHeight();
    }
    return h;
}