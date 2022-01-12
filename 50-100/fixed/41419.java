public void testExtractTimeSeries() {
    java.lang.System.out.println("extractTimeSeries");
    info.debatty.java.datasets.fish.Dataset dataset = new info.debatty.java.datasets.fish.Dataset();
    java.util.LinkedList<info.debatty.java.datasets.fish.Image> images = dataset.getAll();
    java.util.List<info.debatty.java.datasets.fish.TimeSerie> time_series = info.debatty.java.datasets.fish.Dataset.extractTimeSeries(images, 0);
    assertEquals("Not all time series...", 6612, time_series.size());
    assertEquals("Time serie is not of expected length", 240, time_series.get(0).values.length);
}