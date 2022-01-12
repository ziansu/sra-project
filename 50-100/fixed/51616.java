@java.lang.Override
public java.lang.Object getValueAt(int row, int column) {
    rates.classes.Rate r = rates.get(row);
    switch (column) {
        case 0 :
            return r.getCode();
        case 1 :
            return r.getAbbreviatedName();
        case 2 :
            return r.getSales();
        case 3 :
            return r.getMedium();
        case 4 :
            return r.getPurchasable();
        case 5 :
            return r.getName();
    }
    return null;
}