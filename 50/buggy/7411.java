fit.Parse secondLastRow(fit.Parse lastRow) {
    fit.Parse nextRow = table.parts;
    fit.Parse currentRow = null;
    while (nextRow != lastRow) {
        currentRow = nextRow;
        nextRow = nextRow.more;
    } 
    currentRow.more = null;
    return currentRow;
}