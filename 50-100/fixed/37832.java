public void updateTable(int startRange, int endRange, char statusCode, int trackingCode) {
    TrackingNumber.TrackingTableRow ttrNew = new TrackingNumber.TrackingTableRow(startRange, endRange, trackingCode, statusCode);
    rows.add(ttrNew);
    processRows(0, rows.size(), ttrNew);
}