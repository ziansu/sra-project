@java.lang.Override
protected void updateItem(com.github.sarxos.webcam.Webcam camera, boolean empty) {
    super.updateItem(camera, empty);
    if (!empty) {
        if (camera != null) {
            setText(camera.getName());
        }
    }
}