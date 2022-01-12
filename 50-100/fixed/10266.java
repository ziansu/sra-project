public java.lang.Boolean checkActive(int x) {
    java.lang.System.out.println(this.getX());
    if (((this.getX()) >= (x - 60)) && ((this.getX()) <= (x + 120))) {
        setInActive();
        return true;
    }
    return false;
}