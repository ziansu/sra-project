public void freeze() {
    if (!(frozen)) {
        this.frozen = true;
        java.lang.System.out.println("Freeze!");
    }else {
        java.lang.System.out.println("Already frozen!");
    }
}