public java.awt.Container getContainer() {
    if ((container) == null) {
        container = new javax.swing.JPanel();
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        container.setLayout(layout);
        for (gameframework.gui.GameStatusBarElement<?> element : elements) {
            container.add(element.getElementText());
            container.add(element.getElementValue());
        }
        update();
    }
    return container;
}