@java.lang.Override
protected org.elasticsearch.common.settings.Settings nodeSettings(int nodeOrdinal) {
    return org.elasticsearch.common.settings.Settings.builder().put(super.nodeSettings(nodeOrdinal)).put(AssertingLocalTransport.ASSERTING_TRANSPORT_MIN_VERSION_KEY, Version.V_1_4_0_Beta1.toString()).build();
}