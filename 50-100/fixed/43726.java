public synchronized boolean updateParams(com.orientechnologies.orient.core.metadata.sequence.OSequence.CreateParams params) {
    boolean any = false;
    if (((params.start) != null) && ((this.getStart()) != (params.start))) {
        this.setStart(params.start);
        any = true;
    }
    if (((params.increment) != null) && ((this.getIncrement()) != (params.increment))) {
        this.setIncrement(params.increment);
        any = true;
    }
    return any;
}