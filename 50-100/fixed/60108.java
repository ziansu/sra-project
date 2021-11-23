private static java.lang.String nextLine(java.io.BufferedReader reader) throws java.io.IOException {
    while (true) {
        java.lang.String line = reader.readLine();
        if (line == null) {
            return null;
        }
        if (line.trim().isEmpty()) {
            continue;
        }
        if ((line.charAt(0)) == '#') {
            continue;
        }
        return line;
    } 
}