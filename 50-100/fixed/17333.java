private void addData() {
    javafx.collections.ObservableList<dpfmanager.shell.modules.report.util.ReportRow> data = getModel().getData();
    tabReports.setItems(data);
    resizeTable();
    javafx.beans.binding.Bindings.size(tabReports.getItems()).addListener(new javafx.beans.value.ChangeListener<java.lang.Number>() {
        @java.lang.Override
        public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Number> observable, java.lang.Number oldValue, java.lang.Number newValue) {
            resizeTable();
        }
    });
    addChartScore();
    addFormatIcons();
}