public void initMainLayout() {
    initRootLayout();
    addDisplayController(this);
    addInputController(this);
    this.stage.setScene(new javafx.scene.Scene(rootLayout));
    ((raijin.ui.InputController) (rootLayout.getBottom())).getCommandBar().requestFocus();
}