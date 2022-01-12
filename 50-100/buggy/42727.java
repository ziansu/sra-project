private void renderAudio(teacheasy.render.AudioObject audio) {
    audioHandler.createAudio(((double) ((bounds.getMaxX()) * (audio.getXStart()))), ((double) ((bounds.getMaxY()) * (audio.getYStart()))), 300, audio.getSourcefile(), false, false, audio.isViewProgress(), false);
}