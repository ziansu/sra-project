@java.lang.Override
public void reconfigure() {
    if (isEnabled()) {
        api = new com.omertron.thetvdbapi.TheTVDBApi(dynamo.model.tvshows.TVShowManager.TVDBAPI_KEY, new dynamo.httpclient.YAMJHttpClient(hclient.HTTPClient.getInstance()));
        if ((getFolders()) != null) {
            for (java.nio.file.Path path : getFolders()) {
                dynamo.backlog.BackLogProcessor.getInstance().schedule(new model.backlog.NewTVShowFolderTask(path), false);
            }
        }
    }else {
        dynamo.backlog.BackLogProcessor.getInstance().unschedule(model.backlog.ScanTVShowTask.class);
        dynamo.backlog.BackLogProcessor.getInstance().unschedule(model.backlog.NewTVShowFolderTask.class);
    }
}