protected void processPath(Q root) {
    org.appsugar.bean.entity.QGenericIdEntity r = org.appsugar.bean.entity.QGenericIdEntity.genericIdEntity;
    if (java.util.Objects.isNull(createdAt)) {
        createdAt = findPath(root, r.createdAt.getMetadata().getName());
    }
    if (java.util.Objects.isNull(updatedAt)) {
        updatedAt = findPath(root, r.updatedAt.getMetadata().getName());
    }
}