public void displayTable() {
    java.util.Iterator<TrackingRow> it = table.iterator();
    while (it.hasNext()) {
        TrackingRow row = it.next();
        java.lang.System.out.println((((((row.getRange().toString()) + " ") + (row.getStatusCode())) + " ") + (row.getTransferCode())));
    } 
}