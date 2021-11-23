public void unfreeze() {
    if (frozen) {
        this.frozen = false;
        java.lang.System.out.println("It's melting!");
    }else {
        java.lang.System.out.println("Already melted!");
    }
}