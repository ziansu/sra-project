@org.junit.Test
public void testVersion() {
    final int version = 0;
    final org.apache.usergrid.corepersistence.service.ConnectionService connectionService = org.mockito.Mockito.mock(org.apache.usergrid.corepersistence.service.ConnectionService.class);
    final org.apache.usergrid.corepersistence.rx.impl.AllApplicationsObservable allApplicationsObservable = org.mockito.Mockito.mock(org.apache.usergrid.corepersistence.rx.impl.AllApplicationsObservable.class);
    final org.apache.usergrid.corepersistence.migration.DeDupConnectionDataMigration plugin = new org.apache.usergrid.corepersistence.migration.DeDupConnectionDataMigration(connectionService, allApplicationsObservable);
    org.junit.Assert.assertTrue(plugin.supports(version));
    org.junit.Assert.assertFalse(plugin.supports(plugin.getMaxVersion()));
}