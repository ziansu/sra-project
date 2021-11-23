public void stop(final java.lang.String point) {
    if ((this.lastResult) != null) {
        this.lastResult.stop();
        this.getResults().add(this.lastResult);
        if (((this.maxResults) > (-1)) && ((this.getResults().size()) > (this.maxResults))) {
            this.printStatistics();
            this.results = new java.util.LinkedList<>();
        }
    }
}