@javafx.fxml.FXML
public void muteHandler() throws javax.sound.sampled.LineUnavailableException {
    microphoneMuted = !(microphoneMuted);
    javafx.scene.image.Image image;
    if (microphoneMuted) {
        image = new javafx.scene.image.Image(ch.uzh.csg.p2p.controller.MainWindowController.class.getResourceAsStream("/microphone_muted.png"));
        muteBtn.setText("Unmute microphone");
        audioUtils.mute();
    }else {
        image = new javafx.scene.image.Image(ch.uzh.csg.p2p.controller.MainWindowController.class.getResourceAsStream("/microphone.png"));
        muteBtn.setText("Mute microphone");
        audioUtils.unmute();
    }
    microphoneLbl.setGraphic(new javafx.scene.image.ImageView(image));
}