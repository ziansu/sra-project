public java.util.List<com.dp.chart.Xaxis> createXaxis() {
    java.util.List<com.dp.chart.Xaxis> xaxisList = new java.util.ArrayList<>();
    com.dp.chart.Xaxis xaxis = new com.dp.chart.Xaxis();
    java.lang.String[] data = new java.lang.String[]{ "Jan" , "Fev" , "March" , "April" , "May" , "Jun" , "Jul" , "Aug" , "Sep" , "Oct" , "Nov" , "Dec" };
    xaxis.setData(data);
    return xaxisList;
}