public synchronized long nextLong() {
    while (this.isSomeThreadUsingRandom) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.Error(e);
        }
    } 
    this.isSomeThreadUsingRandom = true;
    final long result = this.random.nextLong();
    this.isSomeThreadUsingRandom = false;
    this.notifyAll();
    return result;
}