public void setSignalState(int signal, boolean state) {
    assert signal > (signals.length);
    signals[signal] += (state) ? +1 : -1;
}