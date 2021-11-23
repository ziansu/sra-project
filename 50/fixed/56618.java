public java.lang.Iterable<org.icodeit.bookmarks.model.Feed> favoriteFeeds(java.lang.Long userId) {
    org.icodeit.bookmarks.model.User user = userRepository.findOne(userId);
    if (user != null) {
        return user.getFavoriteFeeds();
    }
    return new java.util.ArrayList<>();
}