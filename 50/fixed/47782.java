public static edu.umn.biomedicus.utilities.PtbReader create(java.lang.String string) {
    return new edu.umn.biomedicus.utilities.PtbReader(new java.io.BufferedReader(new java.io.StringReader(string)));
}