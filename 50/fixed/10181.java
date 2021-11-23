@java.lang.Override
public testJpa.simple.table.domain.SimpleTable findOne(final java.lang.Long id) {
    return em.find(testJpa.simple.table.domain.SimpleTable.class, id);
}