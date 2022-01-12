public java.lang.Integer addCategory(com.nisum.portal.data.domain.Categories category) {
    com.nisum.portal.data.dao.impl.CategoriesDAOImpl.logger.info("CategoriesDAOImpl :: addCategories");
    java.lang.Integer status;
    com.nisum.portal.data.domain.Categories categories = categoriesRepository.findByCategoryName(category.getCategoryName());
    if (categories == null) {
        com.nisum.portal.data.domain.Categories savedCategory = categoriesRepository.save(category);
        status = 1;
    }else {
        status = 0;
    }
    return status;
}