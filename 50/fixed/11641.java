@java.lang.Override
public void delete(com.tpjad.project.entity.Category category) {
    com.tpjad.project.entity.Category categoryToDelete = entityManager.merge(category);
    entityManager.remove(categoryToDelete);
}