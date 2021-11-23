@java.lang.Override
public void handle(javafx.scene.control.TableColumn.CellEditEvent<sopho.Ofeloumenoi.AddOfeloumenoiController.tableManager, java.lang.String> t) {
    ((sopho.Ofeloumenoi.AddOfeloumenoiController.tableManager) (t.getTableView().getItems().get(t.getTablePosition().getRow()))).setEtos(t.getNewValue());
}