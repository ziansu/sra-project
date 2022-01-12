public void join() {
    this.threads[0].run();
    for (int thread = 1; thread < (configuration.Configuration.hybrid_threads); thread++) {
        while ((this.threads[thread].getState()) != (java.lang.Thread.State.WAITING)) {
        } 
    }
}