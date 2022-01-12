public static java.lang.String readLine() {
    java.lang.String in;
    try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in))) {
        in = br.readLine();
    } catch (java.io.IOException ioe) {
        easycs.io.Keyboard.logger.error(ioe.getMessage());
        in = "";
    }
    return in;
}