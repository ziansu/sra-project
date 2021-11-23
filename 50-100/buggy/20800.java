public void endParsing() {
    synchronized(this) {
        this.parsing = false;
        this.ending = true;
        this.notifyAll();
    }
    synchronized(this) {
        while (this.ending) {
            try {
                this.wait();
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        } 
        this.parsing = false;
        this.ending = false;
    }
}