private static java.lang.String readUntilGarbageMetaData(java.io.BufferedReader r) {
    java.lang.String line = null;
    try {
        java.lang.StringBuilder textLines = new java.lang.StringBuilder();
        while ((line = r.readLine()) != null) {
            if (!(edu.psu.ist.acs.micro.mid.scratch.ConstructMID4NewsDocumentSet.isGarbageMetaData(line)))
                textLines.append((line + "\n"));
            else
                return textLines.toString();
            
        } 
    } catch (java.io.IOException e) {
        return null;
    }
    return null;
}