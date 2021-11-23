private static org.sat4j.reader.ECSPFormat tryToInferXmlType(java.lang.String filename) {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.startsWith("<instance")) {
                return org.sat4j.reader.ECSPFormat.tryToInferXmlTypeFromRootMarkup(line);
            }
        } 
    } catch (java.io.FileNotFoundException e) {
        return org.sat4j.reader.ECSPFormat.UNKNOWN;
    } catch (java.io.IOException e) {
        return org.sat4j.reader.ECSPFormat.UNKNOWN;
    }
    return org.sat4j.reader.ECSPFormat.UNKNOWN;
}