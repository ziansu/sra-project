public pl.pszczolkowski.mustdo.domain.task.dto.CommentSnapshot toSnapshot() {
    if ((this.id) == null) {
        throw new pl.pszczolkowski.mustdo.sharedkernel.exception.EntityInStateNewException();
    }
    pl.pszczolkowski.mustdo.domain.task.dto.TaskSnapshot taskSnapshot = task.toSnapshot();
    java.time.LocalDateTime createdAtExport = pl.pszczolkowski.mustdo.config.persistance.converter.LocalDateTimePersistenceConverter.convertToEntityAttributeValue(this.createdAt);
    return new pl.pszczolkowski.mustdo.domain.task.dto.CommentSnapshot(id, taskSnapshot.getId(), text, createdAtExport);
}