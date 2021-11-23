public static javafx.scene.layout.HBox constructButtonPane() {
    javafx.scene.layout.HBox buttonPane = new javafx.scene.layout.HBox();
    buttonPane.setSpacing(gui.modal.ModalUtilities.BUTTON_SPACING);
    buttonPane.setAlignment(javafx.geometry.Pos.CENTER_LEFT);
    buttonPane.setMinHeight(gui.modal.ModalUtilities.BOTTOM_AREA_HEIGHT);
    buttonPane.setPrefHeight(gui.modal.ModalUtilities.BOTTOM_AREA_HEIGHT);
    buttonPane.setMaxHeight(gui.modal.ModalUtilities.BOTTOM_AREA_HEIGHT);
    buttonPane.setStyle(gui.modal.ModalUtilities.BOTTOM_STYLE);
    buttonPane.setPadding(new javafx.geometry.Insets(0, gui.modal.ModalUtilities.TITLE_LABEL_OFFSET_FROM_LEFT, 0, gui.modal.ModalUtilities.TITLE_LABEL_OFFSET_FROM_LEFT));
    return buttonPane;
}