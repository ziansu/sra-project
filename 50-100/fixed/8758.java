@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    javafx.scene.control.CheckBox cb = ((javafx.scene.control.CheckBox) (event.getSource()));
    if (cb.isSelected()) {
        for (application.ResultTable resultTableRow : resultTable.getItems()) {
            resultTableRow.setTrace(true);
        }
    }else {
        for (application.ResultTable resultTableRow : resultTable.getItems()) {
            resultTableRow.setTrace(false);
        }
    }
}