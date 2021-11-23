public void removeComponent(model.Component c) throws model.intelligence.Intelligence.ClosedException {
    c.shutDown();
    components.remove(c);
    if ((gui) != null) {
        gui.updateCompList(components);
    }
}