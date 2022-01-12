protected <T> ch.sourcepond.commons.smartswitch.lib.SmartSwitchBuilder<T> createSmartSwitchBuilder(final java.lang.Class<T> pServiceInterface) {
    return new ch.sourcepond.commons.smartswitch.lib.SmartSwitchBuilderImpl(executorService, new ch.sourcepond.commons.smartswitch.lib.SmartSwitchFactory(executorService), this, pServiceInterface);
}