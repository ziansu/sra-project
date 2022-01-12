private java.lang.String summariseTag(final com.vaguehope.morrigan.model.media.MediaTag t) {
    return summariseTag(t.getTag(), t.getType(), t.getClassification().getClassification(), t.getModified().getTime(), t.isDeleted());
}