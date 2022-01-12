public static java.lang.String readUntilEmptyLine(java.io.BufferedReader r) {
    java.lang.String line = null;
    try {
        java.lang.StringBuilder nonEmptyLines = new java.lang.StringBuilder();
        while ((line = r.readLine()) != null) {
            if ((line.length()) != 0)
                nonEmptyLines.append((line + " "));
            else
                return nonEmptyLines.toString();
            
        } 
    } catch (java.io.IOException e) {
        return null;
    }
    return null;
}