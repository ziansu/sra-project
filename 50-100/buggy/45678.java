public void run() {
    try {
        zedly.luma.LumaCanvas canvas;
        while (true) {
            synchronized(this) {
                wait();
                if (!(alive)) {
                    return ;
                }else
                    if (canvasQueue.isEmpty()) {
                        continue;
                    }
                
                canvas = canvasQueue.remove();
            }
            loadCanvasFromFile(canvas);
        } 
    } catch (java.lang.InterruptedException ex) {
    }
}