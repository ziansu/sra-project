public void delDirection(javafx.event.ActionEvent actionEvent) {
    entity.DirectionEntity direction = directions.getSelectionModel().getSelectedItem();
    controllers.GroupsPanelViewController.db.removeDirection(direction);
    directions.getSelectionModel().selectFirst();
}