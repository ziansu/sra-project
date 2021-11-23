private void loadFonts() {
    javafx.scene.text.Font.loadFont(jfdi.ui.MainSetUp.class.getResourceAsStream(Constants.URL_HAMSMITH_PATH), 14);
    javafx.scene.text.Font.loadFont(jfdi.ui.MainSetUp.class.getResourceAsStream(Constants.URL_RALEWAY_PATH), 24);
}