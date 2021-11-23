public void error(java.lang.Object message, java.lang.Exception e) {
    this.debugln(message, StringColor.RED);
    this.debug("", StringColor.RED);
    e.printStackTrace();
    this.reset();
}