void changeStateAgainst(java.lang.Object... arg) {
    synchronized(this) {
        this.state.changeStateAgainst(arg);
    }
}