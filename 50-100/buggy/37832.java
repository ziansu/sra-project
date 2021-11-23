public void updateTable(int startRange, int endRange, char statusCode, int trackingCode) {
    TrackingNumber.TrackingTableRow ttrNew = new TrackingNumber.TrackingTableRow(startRange, endRange, statusCode, trackingCode);
    rows.add(ttrNew);
    processRows(0, rows.size(), ttrNew);
}