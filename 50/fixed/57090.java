public java.lang.String getNextLine() {
    java.lang.String s = null;
    try {
        s = this.br.readLine();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return s;
}