public java.util.ArrayList<javafx.scene.chart.PieChart.Data> computeAllAttendance(java.util.List<javafx.scene.chart.PieChart.Data> pieChartData) {
    allStudentsData = new java.util.ArrayList<>();
    pieChartData.stream().forEach(( s) -> total += s.getPieValue());
    computeAllAttendancePercentage(pieChartData);
    return allStudentsData;
}