@java.lang.Override
public boolean init(com.neverwinterdp.scribengin.scribe.ScribeState state) {
    this.setState(state);
    scribeThread = new java.lang.Thread() {
        public void run() {
            try {
                consumeLoop();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    };
    scribeThread.start();
    return true;
}