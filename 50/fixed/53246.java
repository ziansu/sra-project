@java.lang.Override
public java.util.List<com.w6.data.Article> findAllByEventId(long eventId) {
    return articleRepository.findAllByEventId(eventId);
}