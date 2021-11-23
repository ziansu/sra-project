@org.junit.Test
public void testAddRow(java.lang.String[] args) {
    java.lang.String input;
    java.util.ArrayList<TrackingRow> table = new java.util.ArrayList<TrackingRow>();
    for (int i = 0; i < 5; i++) {
        java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        input = scanner.next();
        TrackingRow row = Driver.getTrackingRow(input);
        row.addRow(table, row);
    }
}