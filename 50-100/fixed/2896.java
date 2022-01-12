@java.lang.Override
public void run() {
    try {
        player.play();
        if (player.isComplete()) {
            Loop();
        }
    } catch (javazoom.jl.decoder.JavaLayerException ex) {
        java.util.logging.Logger.getLogger(src.PlayAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}