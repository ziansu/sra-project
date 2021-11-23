public boolean reachedEnd() {
    boolean done = (currStep) >= (ralgorithm.ExpandedOneTunnel.NUMSTEPS);
    if (done) {
        java.lang.System.out.println("Thinks its done!");
    }
    return done;
}