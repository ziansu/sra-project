private static void switchListView(javafx.scene.control.ListView listView) {
    if ((listView.getItems().size()) != 0) {
        listView.setOpacity(1);
    }else {
        listView.setOpacity(0);
    }
}