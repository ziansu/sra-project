private com.qcadoo.model.internal.EntityOpResult deleteOrphans(final com.qcadoo.model.internal.InternalDataDefinition dataDefinition, final java.lang.Iterable<com.qcadoo.model.internal.Entity> orphans) {
    com.google.common.base.Preconditions.checkNotNull(dataDefinition, com.qcadoo.model.internal.DataAccessServiceImpl.L_DATA_DEFINITION_MUST_BE_GIVEN);
    com.google.common.base.Preconditions.checkState(dataDefinition.isDeletable(), "Entity must be deletable");
    for (com.qcadoo.model.internal.Entity orphan : orphans) {
        com.qcadoo.model.internal.EntityOpResult result = deleteEntity(dataDefinition, orphan.getId());
        if (!(result.isSuccessfull())) {
            return result;
        }
    }
    return com.qcadoo.model.internal.EntityOpResult.successfull();
}