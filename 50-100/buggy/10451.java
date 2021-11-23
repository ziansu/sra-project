private static boolean hasFormatWithClassHeader(java.lang.String text) {
    java.lang.String[] lines = text.split("\n");
    for (int i = 0; i < (lines.length); i++) {
        if ((lines[i].trim().length()) == 0)
            break;
        
        if (edu.psu.ist.acs.micro.mid.scratch.ConstructMID4NewsDocumentSet.isLineShortDate(lines[i]))
            return true;
        
    }
    return false;
}