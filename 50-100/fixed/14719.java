private void displayOriginalData(org.jfree.data.category.DefaultCategoryDataset lineChart) {
    for (int i = 1; i <= (data.size()); i++) {
        lineChart.addValue(data.get((i - 1)), "Original Data", (i + ""));
    }
}