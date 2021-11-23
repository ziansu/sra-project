public void run() {
    try {
        zedly.luma.LumaCanvas canvas;
        while (true) {
            synchronized(this) {
                while ((alive) && (canvasQueue.isEmpty())) {
                    wait();
                } 
                if (!(alive)) {
                    return ;
                }
                canvas = canvasQueue.remove();
            }
            loadCanvasFromFile(canvas);
        } 
    } catch (java.lang.InterruptedException ex) {
    }
}