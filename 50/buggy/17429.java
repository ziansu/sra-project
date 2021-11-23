public boolean decrement() {
    --(ticks);
    if ((ticks) <= 0) {
        java.lang.System.out.println("executing");
        this.alertable.alert();
        return true;
    }else {
        return false;
    }
}