public void actionPerformed(java.awt.event.ActionEvent e) {
    model.shift(true);
    if (model.hasChanged()) {
        model.notifyObservers();
    }
}