protected void setUp() {
    if (!(tests.ChartTests.setupDone)) {
        csvReader = new csv.CSVReader();
        csvReader.uploadCSV("2_week_campaign_2/server_log.csv", "serverlog");
        csvReader.uploadCSV("2_week_campaign_2/click_log.csv", "clicklog");
        csvReader.uploadCSV("2_week_campaign_2/impression_log.csv", "impressionlog");
        cm = new gui.chart.ChartModel();
        tests.ChartTests.setupDone = true;
    }
}