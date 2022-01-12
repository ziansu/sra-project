@java.lang.Override
protected void handleData() {
    if ((clientOut) != null) {
        clientOut.println(this.datapoint);
    }
}