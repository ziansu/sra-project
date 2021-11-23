public static <D extends javafx.scene.Node & org.eclipse.fx.ui.controls.tabpane.DndTabPaneFactory.DragSetup> javafx.scene.layout.Pane setup(org.eclipse.fx.ui.controls.tabpane.DndTabPaneFactory.FeedbackType feedbackType, D dragSetup, java.util.function.Consumer<org.eclipse.fx.ui.controls.tabpane.GenericTab> detachHandler) {
    javafx.scene.layout.StackPane pane = new javafx.scene.layout.StackPane();
    org.eclipse.fx.ui.controls.tabpane.DndTabPaneFactory.setup(() -> feedbackType, pane, pane.getChildren(), dragSetup, detachHandler);
    pane.getChildren().add(dragSetup);
    return pane;
}