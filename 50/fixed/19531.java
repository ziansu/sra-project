static void updatePublishDateIfShouldBePublishedImmediately(org.wordpress.android.fluxc.model.PostModel postModel) {
    if (org.wordpress.android.ui.posts.PostUtils.shouldPublishImmediately(postModel)) {
        postModel.setDateCreated(org.wordpress.android.util.DateTimeUtils.iso8601FromDate(new java.util.Date()));
    }
}