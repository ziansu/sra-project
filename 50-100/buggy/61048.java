@java.lang.Override
public void run() {
    while (true) {
        try {
            java.lang.Thread.sleep(5L);
        } catch (java.lang.InterruptedException ex) {
            java.util.logging.Logger.getLogger(fourier.fitting.graphic.GraphicFitting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        if (show_animation) {
            time += (2 * (java.lang.Math.PI)) / 3000;
            this.repaint();
        }
    } 
}