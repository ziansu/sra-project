private static void switchListView(javafx.scene.control.ListView listView, javafx.scene.control.TextField textField) {
    if ((listView.getItems().size()) != 0) {
        listView.setOpacity(1);
    }else {
        listView.setOpacity(0);
    }
}