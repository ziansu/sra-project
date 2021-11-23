@java.lang.Override
public java.util.List<com.eswaraj.web.dto.CategoryWithChildCategoryDto> getAllCategories() throws com.eswaraj.core.exceptions.ApplicationException {
    org.springframework.data.neo4j.conversion.EndResult<com.eswaraj.domain.nodes.Category> allCategories = categoryRepository.findAll();
    allCategories.finish();
    return categoryConvertor.convertCategoryWithChildren(allCategories);
}