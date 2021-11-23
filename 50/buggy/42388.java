private void subtestMakeCSVRow(java.lang.String[] input, java.lang.String[] output, java.lang.String sep) {
    java.lang.String row = org.eclipse.birt.report.engine.dataextraction.csv.CSVUtil.makeCSVRow(org.eclipse.birt.report.engine.dataextraction.csv.CSVUtilTest.GENERAL_VALUES_INPUT, sep, false);
    assertRowValues(row, org.eclipse.birt.report.engine.dataextraction.csv.CSVUtilTest.GENERAL_VALUES_OUTPUT, sep);
}