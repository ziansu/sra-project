private void defaultParams(ru.gurps.generator.lib.Feature features) {
    lastId = java.lang.Integer.toString(features.getId());
    addonsArray = javafx.collections.FXCollections.observableArrayList();
    addonsArray.clear();
    lvlText.setText("1");
    finalCost.setText(java.lang.Integer.toString(features.getCost()));
    finalCostText.setText(java.lang.Integer.toString(features.getCost()));
}