public void initMainLayout() {
    initRootLayout();
    addDisplayController(this);
    addInputController(this);
    ((raijin.ui.InputController) (rootLayout.getBottom())).getCommandBar().requestFocus();
    this.stage.setScene(new javafx.scene.Scene(rootLayout));
}