@org.junit.Test
public void testRemoveVmsFromExistingAffinityGroup() {
    org.ovirt.engine.core.common.scheduling.AffinityGroup existing = dao.get(FixturesTool.EXISTING_AFFINITY_GROUP_ID);
    org.junit.Assert.assertFalse(existing.getEntityNames().isEmpty());
    existing.getEntityIds().clear();
    dao.update(existing);
    org.ovirt.engine.core.common.scheduling.AffinityGroup fetched = dao.get(existing.getId());
    org.junit.Assert.assertNull(fetched.getEntityNames());
}