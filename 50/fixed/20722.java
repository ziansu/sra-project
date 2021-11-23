@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    com.drknotter.episodilyzer.utils.SeriesUtils.saveSeriesTaskMap.remove(seriesInfo.seriesId);
}