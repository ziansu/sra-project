private de.scrum_master.dancing_links.Column chooseColumn() {
    de.scrum_master.dancing_links.Column mandatoryColumnWithFewestRemainingRows = null;
    int fewestRemainingRows = java.lang.Integer.MAX_VALUE;
    for (de.scrum_master.dancing_links.Column column = ((de.scrum_master.dancing_links.Column) (rootObject.right)); column != (rootObject); column = ((de.scrum_master.dancing_links.Column) (column.right))) {
        if ((!(column.optional)) && ((column.size) < fewestRemainingRows))
            fewestRemainingRows = column.size;
        
        mandatoryColumnWithFewestRemainingRows = column;
    }
    return mandatoryColumnWithFewestRemainingRows;
}