public ecm.model.Image save(ecm.model.Image image) {
    entityManager.persist(image);
    return image;
}