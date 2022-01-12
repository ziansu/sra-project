private int getTransfers(java.util.ArrayList<java.lang.String> rows) {
    if ((rows == null) || ((rows.size()) == 0))
        return 0;
    
    int numTds = numOfCols(rows.get(0));
    int transfers = -1;
    switch (numTds) {
        case 5 :
            transfers = 0;
            break;
        case 9 :
            transfers = 1;
            break;
        case 12 :
            transfers = 2;
            break;
    }
    return transfers;
}