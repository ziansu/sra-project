public void start() {
    for (java.lang.Thread p : processors) {
        java.lang.System.out.println((("Thread " + (p.toString())) + " RUN"));
        p.start();
    }
}