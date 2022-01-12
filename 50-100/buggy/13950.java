private java.lang.String readLine() {
    java.lang.String line = "";
    try {
        line = this.input.readLine();
    } catch (java.io.IOException e) {
        this.disconnect();
    }
    if (line == null) {
        this.disconnect();
        line = "noname";
    }
    return line;
}