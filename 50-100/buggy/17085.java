public void run() {
    randomID = (randomGenerator.nextInt(32)) + 1;
    randomDecrement = -((randomGenerator.nextInt(2)) + 1);
    dbConnect.getTableModel().setValueAt(((java.lang.Double.parseDouble(java.lang.String.valueOf(dbConnect.getTableModel().getValueAt(randomID, 2)))) + (randomDecrement)), randomID, 2);
    createStockGrid();
}