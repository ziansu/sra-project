private static void moveDown() {
    int selectedIndex = EditLayersPopup.list.getSelectionModel().getSelectedIndex();
    if (selectedIndex != ((Main.layerStrings.size()) - 1)) {
        EditLayersPopup.swap(selectedIndex, (selectedIndex + 1));
        EditLayersPopup.list.getSelectionModel().select((selectedIndex + 1));
    }
}