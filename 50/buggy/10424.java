public java.lang.String readLine() {
    java.io.BufferedReader bf = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in));
    try {
        return bf.readLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println("Error. Wrong input");
        throw new java.lang.RuntimeException(e);
    }
}