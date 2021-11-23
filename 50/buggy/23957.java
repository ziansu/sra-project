public boolean isReady() {
    return (state.ordinal()) >= (org.jyre.ZrePeer.State.READY.ordinal());
}