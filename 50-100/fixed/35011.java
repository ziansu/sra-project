@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    int size = model.getShapes().size();
    if (size > 0) {
        model.Shape temp = model.getShapes().remove((size - 1));
        model.getUndoShapes().add(temp);
        model.update();
    }
}