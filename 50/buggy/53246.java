@java.lang.Override
public java.util.List<com.w6.data.Article> findAllByEventId(long eventId) {
    java.util.List<com.w6.data.Article> result = new java.util.ArrayList<>();
    articleRepository.findAllByEventId(eventId).forEach(result::add);
    return articleRepository.findAllByEventId(eventId);
}