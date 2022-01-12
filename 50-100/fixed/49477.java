public static void main(java.lang.String[] args) throws java.lang.Exception {
    spreadsheet.SpreadsheetCalculator.readSheet();
    for (java.lang.String key : spreadsheet.SpreadsheetCalculator.sheet.keySet()) {
        if (!(spreadsheet.SpreadsheetCalculator.solve(key)))
            java.lang.System.out.println("Error: Circular dependency!");
        else
            java.lang.System.out.println(spreadsheet.SpreadsheetCalculator.sheet.get(key));
        
    }
}