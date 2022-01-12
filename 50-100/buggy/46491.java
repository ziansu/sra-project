@java.lang.Override
public void persist(org.javers.core.commit.Commit commit) {
    org.javers.common.collections.Optional<java.lang.Long> primaryKey = commitRepository.getCommitPrimaryKey(commit);
    if (primaryKey.isPresent()) {
        throw new org.javers.common.exception.JaversException(org.javers.common.exception.JaversExceptionCode.CANT_SAVE_ALREADY_PERSISTED_COMMIT);
    }
    long commitPk = commitRepository.save(commit.getAuthor(), commit.getCommitDate(), commit.getId());
    cdoSnapshotRepository.save(commitPk, commit.getSnapshots());
}