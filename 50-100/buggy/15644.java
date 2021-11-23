@java.lang.Override
public void run() {
    do {
        try {
            java.io.FileInputStream in = new java.io.FileInputStream(file);
            this.p1 = new javazoom.jl.player.Player(in);
            p1.play();
        } catch (javazoom.jl.decoder.JavaLayerException jle) {
            jle.printStackTrace();
        } catch (java.io.FileNotFoundException fnf) {
            fnf.printStackTrace();
        }
    } while (loop );
    p1.close();
}