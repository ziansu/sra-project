public boolean play() {
    if (this.canPlay()) {
        Woo.users[(((Woo.order) + 1) % (Woo.users.length))].draw();
        Woo.users[(((Woo.order) + 1) % (Woo.users.length))].draw();
        java.lang.System.out.println("Played a Draw Two card. Next player draws two cards.");
        return true;
    }
    return false;
}