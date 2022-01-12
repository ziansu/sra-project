public java.lang.String getTags() {
    java.lang.String globalTags = java.lang.System.getenv("MP_METRICS_TAGS");
    if ((globalTags != null) && (!(globalTags.isEmpty()))) {
        return ((tags) + ",") + globalTags;
    }else {
        return tags;
    }
}