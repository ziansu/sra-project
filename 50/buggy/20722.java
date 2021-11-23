@java.lang.Override
protected void onPostExecute(com.drknotter.episodilyzer.model.Series series) {
    super.onPostExecute(series);
    com.drknotter.episodilyzer.utils.SeriesUtils.saveSeriesTaskMap.remove(seriesInfo.seriesId);
}