public com.dorinbrage.easyrs.example.web.model.User updateById(com.dorinbrage.easyrs.example.web.model.User model) {
    return em.merge(model);
}