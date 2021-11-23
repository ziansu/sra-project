public void removeComponent(model.Component c) {
    components.remove(c);
    if ((gui) != null) {
        gui.updateCompList(components);
    }
}