public static void makeBarChartPrefs(int[] prefCount, boolean doingSeminar) {
    java.lang.String title;
    if (doingSeminar)
        title = "Seminar Preference Placements";
    else
        title = "Regular Preference Placements";
    
    BarChartMaker chart = new BarChartMaker(title, title, "Preference ID", "Number of Students", prefCount, 1);
    chart.pack();
    org.jfree.ui.RefineryUtilities.centerFrameOnScreen(chart);
    chart.setVisible(true);
}