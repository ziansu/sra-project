public void setupStandardKeyBinding(javafx.scene.Node root) {
    root.addEventFilter(javafx.scene.input.KeyEvent.KEY_PRESSED, ( event) -> {
        if ((event.getCode().equals(javafx.scene.input.KeyCode.ENTER)) && (event.isAltDown())) {
            try {
                toggleFullscreen();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }else
            if (event.getCode().equals(javafx.scene.input.KeyCode.SPACE))
                togglePlayPause();
            
        
    });
}