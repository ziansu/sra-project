public java.lang.String[] writeNewsListHeadline() {
    int i = 0;
    java.lang.String[] s = new java.lang.String[termine.size()];
    for (bkmi.de.hftl_app.help.HftlEvent termin : termine) {
        s[(i++)] = termin.head;
    }
    return s;
}