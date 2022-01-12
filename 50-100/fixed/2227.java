public static void main(java.lang.String[] args) throws java.io.IOException {
    Main.XMLExporter.exportXML();
    Main.JSONExporter.exportJSON();
    java.util.ArrayList<Main.Portfolio> test = ReportGenerator.PortfolioReport.getPersonList();
    for (int i = 0; i < (test.size()); i++)
        java.lang.System.out.println(test.get(i).toString());
    
}