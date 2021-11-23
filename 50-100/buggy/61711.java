public void processFinish(java.lang.String output) {
    java.lang.String[] colNames = new java.lang.String[]{ "Name" , "dec" , "Quantity" , "inc" , "Cost_Each" , "Type" , "Id" };
    java.lang.String[] rowNames = new java.lang.String[]{ "name" , "quantity" , "cost_each" , "type" , "id" };
    table = new table.SalesTable(output, ((android.widget.TableLayout) (findViewById(R.id.tableSales))), this, colNames, rowNames);
    table.buildTable();
}