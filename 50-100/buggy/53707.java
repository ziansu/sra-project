private void dealWithChunks(java.util.List<cz.filmtit.client.pages.TimedChunk> original, java.util.List<cz.filmtit.client.pages.TranslationResult> translated, java.util.List<cz.filmtit.client.pages.TimedChunk> unedited) {
    com.google.gwt.core.client.Scheduler.get().scheduleIncremental(new cz.filmtit.client.pages.TranslationWorkspace.ShowOriginalCommand(original));
    com.google.gwt.core.client.Scheduler.get().scheduleIncremental(new cz.filmtit.client.pages.TranslationWorkspace.ShowUserTranslatedCommand(translated));
    if (isPosteditOn()) {
    }
    prepareSendChunkCommand(unedited);
    startShowingTranslationsIfReady();
}