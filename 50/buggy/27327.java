public void GenerateFuture() {
    this.future = subJob.scheduleBuild2(subJob.getQuietPeriod(), new hudson.model.Cause.UpstreamCause(((hudson.model.Run) (multiJobBuild))), actions.toArray(new hudson.model.Action[0]));
}