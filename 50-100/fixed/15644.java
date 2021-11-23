@java.lang.Override
public void run() {
    try {
        do {
            java.io.FileInputStream in = new java.io.FileInputStream(file);
            this.p1 = new javazoom.jl.player.Player(in);
            p1.play();
        } while (loop );
    } catch (javazoom.jl.decoder.JavaLayerException jle) {
        jle.printStackTrace();
    } catch (java.io.FileNotFoundException fnf) {
        fnf.printStackTrace();
    }
    p1.close();
}