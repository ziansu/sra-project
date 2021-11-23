public java.lang.String getTournamentSystem() {
    for (java.lang.String s : selectedTypes) {
        if (s == "KO-System") {
            return s;
        }
    }
    return "none";
}