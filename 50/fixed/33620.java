public java.util.List<com.langon.model.Comment> findByPhotoId(java.lang.Long photoId) {
    return commentDao.findByPhotoId(photoId);
}