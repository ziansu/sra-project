private void createDatePicker() {
    datePicker = new javafx.scene.control.DatePicker(getDate());
    datePicker.setMinWidth(((this.getWidth()) - ((this.getGraphicTextGap()) * 2)));
    datePicker.setOnAction(( e) -> {
        commitEdit(datePicker.getValue().toString());
    });
}