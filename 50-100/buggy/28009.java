static boolean shouldPublishImmediately(org.wordpress.android.fluxc.model.PostModel postModel) {
    if (!(org.wordpress.android.ui.posts.PostUtils.shouldPublishImmediatelyOptionBeAvailable(postModel))) {
        return false;
    }
    java.util.Date pubDate = org.wordpress.android.util.DateTimeUtils.dateFromIso8601(postModel.getDateCreated());
    java.util.Date now = new java.util.Date();
    return !(pubDate.after(now));
}