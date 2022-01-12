public long nextLong() {
    synchronized(this.random) {
        while (this.isSomeThreadUsingRandom) {
            try {
                this.random.wait();
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.Error(e);
            }
        } 
        this.isSomeThreadUsingRandom = true;
        final long result = this.random.nextLong();
        this.isSomeThreadUsingRandom = false;
        this.random.notifyAll();
        return result;
    }
}