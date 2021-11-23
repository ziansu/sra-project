private javafx.event.EventHandler<javafx.scene.input.MouseEvent> getOnreleaseHandler() {
    return ( e) -> {
        if (dragging) {
            dummyPane.setVisible(false);
            thisBlock.setVisible(true);
            feedbackPane.setVisible(false);
            dragging = false;
            snapPane(thisBlock, dummyPane, e.getSceneX(), e.getSceneY(), draggingType);
            this.fireEvent(new gui.ShotblockUpdatedEvent());
        }
    };
}