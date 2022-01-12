protected void runLowLevel() {
    tokens.take();
    try {
        echo();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    } finally {
        tokens.release();
    }
}