public static java.lang.String capitalizeSpacedLetters(java.lang.String str) {
    java.lang.String[] tokens = str.split("\\s");
    java.lang.String ret = "";
    for (java.lang.String t : tokens) {
        ret += (com.maxl.java.aips2sqlite.Utilities.capitalizeFirstLetter(t)) + " ";
    }
    return ret.trim();
}