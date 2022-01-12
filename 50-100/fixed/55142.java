@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    view.setColor(view.BLACK);
    if ((selectedShape) != null) {
        if ((view.getShapeType()) == (Type.select)) {
            model.modifyShape(selectedShape, x, y, width, height, java.awt.Color.BLACK, view.getFilledCheckBox().isSelected(), java.lang.Integer.parseInt(((java.lang.String) (view.getThicknessComboBox().getSelectedItem()))), false);
        }
    }
}