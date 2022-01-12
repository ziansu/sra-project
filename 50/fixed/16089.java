void changeState(boolean state, java.lang.Object... arg) {
    synchronized(this) {
        this.state.changeState(state, arg);
    }
}