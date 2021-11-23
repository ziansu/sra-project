@java.lang.Override
public boolean stopCellEditing() {
    if ((model.ic.getNbrOfItems()) > 0) {
        model.ic.changeAmount(this.row, ((int) (spinner.getValue())));
    }
    return super.stopCellEditing();
}