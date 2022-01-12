@java.lang.Override
public void addCategory(mappers.CategoryDTO categoryDTO, java.lang.Long id) {
    if (((categoryDTO.getText()) != null) && ((categoryDTO.getParentID()) != null)) {
        entities.category.Category parent = categoryRepository.read(id, entityManager);
        entities.category.Category category = mappers.CategoryMapper.mapToCategory(categoryDTO);
        category.setParent(parent);
        categoryRepository.add(category, entityManager);
    }
}