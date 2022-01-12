protected void updateProgress(android.content.Intent data, us.nineworlds.serenity.core.model.VideoContentInfo video) {
    long position = 0;
    position = data.getIntExtra("position", 0);
    video.setResumeOffset(java.lang.Long.valueOf(position).intValue());
    if (video.isPartiallyWatched()) {
        us.nineworlds.serenity.core.services.UpdateProgressRequest request = new us.nineworlds.serenity.core.services.UpdateProgressRequest(position, video);
        video.setResumeOffset(java.lang.Long.valueOf(position).intValue());
        request.execute();
        return ;
    }
}