private void detailSelectionTeacher() {
    listDetails.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.MULTIPLE);
    listDetails.setOnMouseClicked(( click) -> {
        if ((click.getClickCount()) == 1) {
            java.lang.String clickedString = listDetails.getSelectionModel().getSelectedItem().toString();
            if (listSelectedStrings.contains(clickedString)) {
                listSelectedStrings.remove(clickedString);
            }else {
                listSelectedStrings.add(clickedString);
            }
            listDetails.getSelectionModel().selectAll();
        }
    });
}