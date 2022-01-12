@javafx.fxml.FXML
private void buyFoodMule() {
    java.lang.System.out.println("Bought Food Mule");
    if ((sample.Context.getCurrentPlayer().getBalance()) > 125) {
        sample.Context.getCurrentPlayer().setBalance(((sample.Context.getCurrentPlayer().getBalance()) - 125));
        sample.Context.getCurrentPlayer().setMule(new Map.FoodMule());
    }
}