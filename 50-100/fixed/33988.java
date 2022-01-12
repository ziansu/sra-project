protected void updateProgress(android.content.Intent data, us.nineworlds.serenity.core.model.VideoContentInfo video) {
    long position = 0;
    position = data.getIntExtra("position", 0);
    us.nineworlds.serenity.core.services.UpdateProgressRequest request = new us.nineworlds.serenity.core.services.UpdateProgressRequest(position, video);
    video.setResumeOffset(java.lang.Long.valueOf(position).intValue());
    request.execute();
}