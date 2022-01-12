public static void main(java.lang.String[] args) {
    com.betbrain.b3.api.B3Api b3 = new com.betbrain.b3.api.B3Engine();
    java.util.LinkedList<com.betbrain.b3.report.detailedodds.DetailedOddsTableData> result = b3.reportDetailedOddsTable(219900664L, 3L, 47L, null, null, null, null, null);
    for (java.lang.Object o : result) {
        java.lang.System.out.println(o);
    }
}