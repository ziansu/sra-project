private java.util.List<com.dragoonart.subtitle.finder.beans.SubtitleArchiveEntry> lookupSubtitles(com.dragoonart.subtitle.finder.beans.VideoEntry ve) {
    java.util.List<com.dragoonart.subtitle.finder.beans.SubtitleArchiveEntry> result = new java.util.ArrayList<com.dragoonart.subtitle.finder.beans.SubtitleArchiveEntry>();
    result.addAll(getSubtitlesSubSab(ve));
    result.addAll(getSubtitlesSubSab(ve));
    return result;
}