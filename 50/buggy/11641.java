@java.lang.Override
public void delete(com.tpjad.project.entity.Category category) {
    com.tpjad.project.entity.Category categoryToDelete = entityManager.merge(category);
    for (com.tpjad.project.entity.Product p : categoryToDelete.getProducts()) {
        entityManager.remove(p);
    }
    entityManager.remove(categoryToDelete);
}