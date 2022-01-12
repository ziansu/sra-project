@java.lang.Override
public void doStuff() {
    try {
        if ("LATEST".equalsIgnoreCase(this.version)) {
            this.setUrl(this.repo.getLatest());
        }else {
            int number = java.lang.Integer.valueOf(this.version);
            this.setUrl(this.repo.getFor(number));
        }
        super.doStuff();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}