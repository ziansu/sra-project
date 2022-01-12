@org.junit.Test
public void testVersion() {
    final org.apache.usergrid.corepersistence.service.ConnectionService connectionService = org.mockito.Mockito.mock(org.apache.usergrid.corepersistence.service.ConnectionService.class);
    final org.apache.usergrid.corepersistence.rx.impl.AllApplicationsObservable allApplicationsObservable = org.mockito.Mockito.mock(org.apache.usergrid.corepersistence.rx.impl.AllApplicationsObservable.class);
    final org.apache.usergrid.corepersistence.migration.DeDupConnectionDataMigration plugin = new org.apache.usergrid.corepersistence.migration.DeDupConnectionDataMigration(connectionService, allApplicationsObservable);
    org.junit.Assert.assertTrue(plugin.supports(0));
    org.junit.Assert.assertTrue(plugin.supports(1));
    org.junit.Assert.assertFalse(plugin.supports(plugin.getMaxVersion()));
}