@java.lang.Override
public void handle(javafx.scene.input.KeyEvent event) {
    if ((selectedcell) != null) {
        int value = selectedcell.keyToInt(event);
        if (value != (-1)) {
            selectedcell.updateCell(value);
            selectedcell = null;
        }
    }
}