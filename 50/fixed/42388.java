private void subtestMakeCSVRow(java.lang.String[] input, java.lang.String[] output, java.lang.String sep) {
    java.lang.String row = org.eclipse.birt.report.engine.dataextraction.csv.CSVUtil.makeCSVRow(input, sep, false);
    assertRowValues(row, output, sep);
}