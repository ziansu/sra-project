@java.lang.Override
public java.util.List<nl.unionsoft.sysstate.domain.InstanceLink> retrieve(java.lang.Long instanceFromId, java.lang.String name) {
    return entityManager.createQuery(("FROM InstanceLink ilk " + (("WHERE ilk.from.id = :instanceFromId " + "AND ilk.to.id = :instanceToId ") + "AND ilk.name = :name")), nl.unionsoft.sysstate.domain.InstanceLink.class).setParameter("instanceFromId", instanceFromId).setParameter("name", name).getResultList();
}