@org.jetbrains.annotations.Nullable
private com.kaylerrenslow.armaDialogCreator.control.sv.SVArray createValue() {
    java.lang.String[] values = new java.lang.String[editors.size()];
    int i = 0;
    for (com.kaylerrenslow.armaDialogCreator.gui.fxcontrol.inputfield.InputField tf : editors) {
        if ((tf.getValue()) == null) {
            return null;
        }
        values[(i++)] = tf.getText();
    }
    return new com.kaylerrenslow.armaDialogCreator.control.sv.SVArray(values);
}