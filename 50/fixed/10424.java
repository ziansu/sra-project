public java.lang.String readLine() {
    try {
        return bf.readLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error. Wrong input");
        throw new java.lang.RuntimeException(e);
    }
}