public java.lang.String getTags() {
    java.lang.String result = null;
    java.lang.String globalTags = java.lang.System.getenv("MP_METRICS_TAGS");
    if ((globalTags != null) && (!(globalTags.isEmpty()))) {
        result = globalTags;
    }
    if (((tags) != null) && (!(tags.isEmpty()))) {
        result = (result + ",") + (tags);
    }
    return result;
}