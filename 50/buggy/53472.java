public void LoadContentTVView(javafx.scene.layout.Pane parent) throws java.io.IOException {
    GuiServiceRegistry.instance.getViewLoader().Load(parent, "ContentTV", new gui.controller.ContentTVController());
}