public eu.dapaas.dao.Transformation getDetail(eu.dapaas.dao.User user, java.lang.String id) {
    if (user == null) {
        return new eu.dapaas.dao.Transformation();
    }
    eu.dapaas.handler.TransformationCatalogHandler handler = new eu.dapaas.handler.TransformationCatalogHandler();
    if (user != null) {
        handler = new eu.dapaas.handler.TransformationCatalogHandler(user.getApiKey(), user.getApiSecret());
    }
    return handler.getDetail(id);
}