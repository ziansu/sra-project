private java.lang.String calculateTabs(java.lang.String toPrint, int count) {
    int tab_count = 0;
    java.lang.String tab = "\t";
    while (((toPrint.length()) + (tab_count * 4)) < 24) {
        tab_count++;
        tab += "\t";
    } 
    return tab;
}