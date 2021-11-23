@org.springframework.transaction.annotation.Transactional(readOnly = false)
public java.util.List<song.core.model.NewsDetail> save(java.util.List<song.core.model.NewsDetail> entities) {
    java.util.List<song.core.model.NewsDetail> detailList = detailRepository.save(entities);
    return detailList;
}