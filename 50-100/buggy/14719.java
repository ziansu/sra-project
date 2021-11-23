private void displayOriginalData(org.jfree.data.category.DefaultCategoryDataset lineChart) {
    for (int i = 0; i < (data.size()); i++) {
        lineChart.addValue(data.get(i), "Original Data", (i + ""));
    }
}