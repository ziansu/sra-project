@java.lang.Override
public void delete(java.lang.Long instanceFromId, java.lang.Long instanceToId, java.lang.String name) {
    entityManager.createQuery(("DELETE FROM InstanceLink ilk " + (("WHERE ilk.from.id = :instanceFromId " + "AND ilk.to.id = :instanceToId ") + "AND ilk.name = :name"))).setParameter("instanceFromId", instanceFromId).setParameter("instanceToId", instanceToId).setParameter("name", name).executeUpdate();
}