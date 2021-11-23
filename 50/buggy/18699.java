public void run() {
    if (!(this.isDisposed())) {
        refresh();
    }else {
        dataComp.unregister(this);
    }
}