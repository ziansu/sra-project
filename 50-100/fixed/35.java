private ComponentManager addComponent(ComponentManager cm, java.util.List<ComponentManager> list, java.awt.ComponentOrientation orientation) {
    ComponentManager clone = create(cm.getWallet().clone(), cm.button.getBackground(), cm.getBounds(), orientation);
    list.add(clone);
    clearBuffer();
    render();
    return clone;
}