public static java.lang.String readUntilNonEmptyLine(java.io.BufferedReader r) {
    java.lang.String line = null;
    try {
        while ((line = r.readLine()) != null) {
            if ((line.length()) > 0) {
                return (line + " ") + (edu.psu.ist.acs.micro.mid.scratch.ConstructMID4NewsDocumentSet.readUntilEmptyLine(r));
            }
        } 
    } catch (java.io.IOException e) {
        return null;
    }
    return null;
}