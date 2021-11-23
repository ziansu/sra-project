public static boolean searchInNames(bioNLPboun.Term candidate) {
    boolean isMatched = false;
    for (bioNLPboun.Names namesObject : Main.allNames) {
        if (namesObject.name_txt.equals(candidate.name_txt)) {
            isMatched = true;
            candidate.term_id = namesObject.tax_id;
            break;
        }
    }
    return isMatched;
}