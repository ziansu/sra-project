protected boolean isInputInteger(javafx.scene.control.TextField t) {
    java.lang.System.out.print("injaa");
    return t.getText().trim().matches("^[0-9]+$");
}