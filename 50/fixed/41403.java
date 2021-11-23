public void unload() {
    synchronized(this) {
        if ((this.isStopped()) && (this.isFull())) {
            java.lang.System.out.println("Unboarding...");
            this.allowUnboarding = true;
        }
    }
}