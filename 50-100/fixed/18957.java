@java.lang.Override
public void reconfigure() {
    if (isEnabled()) {
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