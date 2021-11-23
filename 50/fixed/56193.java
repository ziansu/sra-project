@java.lang.Override
public void onResolutionsFinished(java.util.List<com.sensorberg.sdk.resolver.BeaconEvent> events) {
    org.fest.assertions.api.Assertions.assertThat(events).hasSize(0);
}