public void setMajorReady() {
    synchronized(this) {
        this.majorReady = true;
        checkIfPipeReady();
    }
}