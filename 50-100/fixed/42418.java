protected java.lang.Object clones() {
    ai.Status f = new ai.Status();
    try {
        f.x.putAll(this.x);
        f.o.putAll(this.o);
        f.u.putAll(this.u);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("clone error");
    }
    return f;
}