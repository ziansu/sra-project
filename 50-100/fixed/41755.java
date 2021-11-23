public models.common.Component createAndPersistComponent(models.common.Study study, models.common.Component component) {
    if ((component.getUuid()) == null) {
        component.setUuid(java.util.UUID.randomUUID().toString());
    }
    component.setStudy(study);
    if (!(study.hasComponent(component))) {
        study.addComponent(component);
        studyDao.update(study);
    }
    componentDao.create(component);
    return component;
}