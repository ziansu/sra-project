public void resetAllRows() {
    for (org.eclipse.swt.widgets.Composite existingRow : this.allRows) {
        existingRow.setEnabled(false);
    }
    this.allRows = new java.util.ArrayList<org.eclipse.swt.widgets.Composite>();
}