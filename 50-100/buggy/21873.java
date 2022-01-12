public void drawGraph(final int id, final int radius) {
    this.getChildren().clear();
    new java.lang.Thread() {
        public void run() {
            try {
                parsing.Parser.getThread().join();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
            drawGraphUtil(id, radius);
        }
    }.start();
}