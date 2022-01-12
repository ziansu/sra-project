@java.lang.Override
public void execute(android.app.Activity activity, com.mediator.model.VideoEntry videoEntry) {
    this.context = activity;
    this.videoEntry = videoEntry;
    com.squareup.otto.Bus bus = new com.squareup.otto.Bus();
    bus.register(this);
    com.mediator.tasks.TaskBuildSubtitleFile taskBuildSubtitleFile = new com.mediator.tasks.TaskBuildSubtitleFile(context, bus);
    taskBuildSubtitleFile.execute(videoEntry);
}