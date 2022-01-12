@java.lang.Override
public void handle(javafx.scene.input.KeyEvent e) {
    if ((selectedcell) != null) {
        int value = selectedcell.keyToInt(e);
        if (value != (-1)) {
            selectedcell.updateCell(value);
            selectedcell = null;
        }
    }
}