public boolean save(java.lang.String statuses) {
    return db.insertDocument(properties.ProjectProperties.instance().getTwitterStatusesDatabase(), statuses);
}