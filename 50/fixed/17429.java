public boolean decrement() {
    --(ticks);
    if ((ticks) <= 0) {
        this.alertable.alert();
        return true;
    }else {
        return false;
    }
}