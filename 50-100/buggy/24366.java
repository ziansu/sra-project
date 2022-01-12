@hugo.weaving.DebugLog
public static synchronized void saveSeries(final com.drknotter.episodilyzer.server.model.SaveSeriesInfo seriesInfo) {
    if (seriesInfo == null) {
        return ;
    }
    if (!(com.drknotter.episodilyzer.utils.SeriesUtils.saveSeriesTaskMap.containsKey(seriesInfo.seriesId))) {
        com.drknotter.episodilyzer.server.task.SaveSeriesAsyncTask task = new com.drknotter.episodilyzer.server.task.SaveSeriesAsyncTask(seriesInfo) {
            @java.lang.Override
            protected void onPostExecute(com.drknotter.episodilyzer.model.Series series) {
                super.onPostExecute(series);
                com.drknotter.episodilyzer.utils.SeriesUtils.saveSeriesTaskMap.remove(seriesInfo.seriesId);
            }

            @java.lang.Override
            protected void onCancelled() {
                super.onCancelled();
            }
        };
        task.execute();
    }
}