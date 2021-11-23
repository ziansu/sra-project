@javafx.fxml.FXML
public void useExpPotion() {
    if ((expCount.getText()) != "0") {
        game.useItem(ItemType.EXPERIENCE);
        updateInventory();
    }
}