public static void main(java.lang.String[] args) {
    java.lang.String input;
    TrackingTable table = new TrackingTable();
    for (int i = 0; i < 5; i++) {
        java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        input = scanner.next();
        TrackingRow row = Driver.getTrackingRow(input);
        table.addRow(row);
    }
    table.displayTable();
}