@java.lang.Override
public void doStuff() {
    try {
        if ("LATEST".equalsIgnoreCase(this.version)) {
            this.setUrl(this.repo.getLatest());
        }else {
            this.setUrl(this.repo.getFor(this.version));
        }
        super.doStuff();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}