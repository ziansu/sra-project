private void addSubmitListener() {
    submitButton.addActionListener(( e) -> {
        dateFrameController.start();
        dispatchEvent(new java.awt.event.WindowEvent(this, java.awt.event.WindowEvent.WINDOW_CLOSING));
    });
}