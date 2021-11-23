@java.lang.Override
public void println(java.lang.String x) {
    super.println(x);
    this.OUTPUT.add(x);
    for (java.lang.String str : this.OUTPUT) {
        Gdx.app.log("TEST", str);
    }
}