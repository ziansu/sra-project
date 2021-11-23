public void decrementaTitolo(int row) {
    int q = (java.lang.Integer.parseInt(carrelloTb.getValueAt(row, 2).toString())) - 1;
    if (q == 0) {
        carrelloTb.setValueAt(q, row, 2);
        cCarrello.decrementaQta(row);
    }
    if (q > 0) {
        carrelloTb.setValueAt(q, row, 2);
        cCarrello.decrementaQta(row);
    }
}