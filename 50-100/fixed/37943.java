private void createPieModel() {
    pieModel = new com.bionic.edu.bean.PieChartModel();
    reportBean.refreshCategoryReport();
    for (com.bionic.edu.util.ReportCategory category : reportBean.getReportCategories()) {
        pieModel.set(category.getDishCategoryName(), category.getTotal());
    }
    pieModel.setTitle("Categories Diagram");
    pieModel.setLegendPosition("e");
    pieModel.setFill(false);
    pieModel.setShowDataLabels(true);
    pieModel.setDiameter(150);
}