@org.junit.Test
public void shouldDetectWhenResourceWasLoadedOnlyOnce() {
    com.gemserk.resources.MockResource resource = new com.gemserk.resources.MockResource(new com.gemserk.resources.dataloaders.MockDataLoader("DATA"));
    com.gemserk.resources.monitor.ResourceStatusMonitor resourceStatusMonitor = new com.gemserk.resources.monitor.ResourceStatusMonitor(resource);
    resource.load();
    resourceStatusMonitor.checkChanges();
    resourceStatusMonitor.checkChanges();
    org.junit.Assert.assertThat(resourceStatusMonitor.wasLoaded(), org.hamcrest.core.IsEqual.equalTo(false));
    resourceStatusMonitor.checkChanges();
    org.junit.Assert.assertThat(resourceStatusMonitor.wasLoaded(), org.hamcrest.core.IsEqual.equalTo(false));
}