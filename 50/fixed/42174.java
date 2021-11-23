@java.lang.Override
public testJpa.simple.table.domain.SimpleTable save(final testJpa.simple.table.domain.SimpleTable entity) {
    return em.merge(entity);
}