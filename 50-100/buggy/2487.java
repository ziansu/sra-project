@org.junit.Test
public void shouldDetectWhenResourceWasUnloadedOnlyOnce() {
    com.gemserk.resources.MockResource resource = new com.gemserk.resources.MockResource(new com.gemserk.resources.dataloaders.MockDataLoader("DATA"));
    resource.load();
    com.gemserk.resources.monitor.ResourceStatusMonitor resourceStatusMonitor = new com.gemserk.resources.monitor.ResourceStatusMonitor(resource);
    resource.unload();
    resourceStatusMonitor.checkChanges();
    resourceStatusMonitor.checkChanges();
    org.junit.Assert.assertThat(resourceStatusMonitor.wasUnloaded(), org.hamcrest.core.IsEqual.equalTo(false));
}