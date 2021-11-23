public pl.pszczolkowski.mustdo.domain.task.dto.CommentSnapshot toSnapshot() {
    if ((this.id) == null) {
        throw new pl.pszczolkowski.mustdo.sharedkernel.exception.EntityInStateNewException();
    }
    java.time.LocalDateTime createdAtExport = pl.pszczolkowski.mustdo.config.persistance.converter.LocalDateTimePersistenceConverter.convertToEntityAttributeValue(this.createdAt);
    return new pl.pszczolkowski.mustdo.domain.task.dto.CommentSnapshot(id, task.getId(), text, createdAtExport);
}