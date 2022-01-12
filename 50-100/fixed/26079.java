@java.lang.Override
public void focusGained(net.sourceforge.marathon.javafxrecorder.component.RFXComponent prev) {
    listSelectionText = getListSelectionText(((javafx.scene.control.ListView<?>) (node)));
    cellValue = getListCellValue(((javafx.scene.control.ListView<?>) (node)), index);
    cellInfo = getListSelectionText(((javafx.scene.control.ListView<?>) (node)), index);
}