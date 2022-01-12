public java.lang.String[] writeNewsListContent() {
    int i = 0;
    java.lang.String[] s = new java.lang.String[termine.size()];
    for (bkmi.de.hftl_app.help.HftlEvent termin : termine) {
        s[(i++)] = termin.text;
    }
    return s;
}