@java.lang.Override
public javafx.beans.value.ObservableValue<T> call(final javafx.scene.control.TableColumn.CellDataFeatures<netscape.javascript.JSObject, T> aCellDataFeatures) {
    final javafx.scene.control.TableColumn<netscape.javascript.JSObject, T> iTableColumn = aCellDataFeatures.getTableColumn();
    if (!(this.added)) {
        iTableColumn.addEventHandler(javafx.scene.control.TableColumn.editCommitEvent(), this);
        this.added = true;
    }
    final javafx.beans.value.ObservableValue<T> iObservableValue = this.getObservableValue(iTableColumn, aCellDataFeatures);
    return iObservableValue;
}