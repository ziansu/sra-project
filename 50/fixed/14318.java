public void add(final de.uni_freiburg.informatik.ultimate.util.InCaReCounter inCaReCounter) {
    mInternal += inCaReCounter.getInternal();
    mCall += inCaReCounter.getCall();
    mReturn += inCaReCounter.getReturn();
}