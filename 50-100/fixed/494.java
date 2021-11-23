public void resizeComponents() {
    java.awt.Component temp;
    for (int i = 0; i < (content.getComponentCount()); i++) {
        if ((temp = content.getComponent(i)).isValid()) {
            resizeComponent(i, temp);
        }
    }
}