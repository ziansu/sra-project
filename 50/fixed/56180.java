public void load() {
    synchronized(this) {
        java.lang.System.out.println("Boarding...");
        this.allowBoarding = true;
    }
}