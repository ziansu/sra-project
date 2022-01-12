public void displayTable() {
    for (TrackingRow row : table) {
        java.lang.System.out.println((((((row.getRange().toString()) + " ") + (row.getStatusCode())) + " ") + (row.getTransferCode())));
    }
}