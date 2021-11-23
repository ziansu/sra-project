public static boolean isPublishable(org.wordpress.android.fluxc.model.PostModel post) {
    return !(((post.getContent().isEmpty()) && (post.getExcerpt().isEmpty())) && (post.getTitle().isEmpty()));
}