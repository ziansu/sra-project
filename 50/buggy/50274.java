@java.lang.Override
public void afterUpdate(final java.lang.String jsonObject, final de.cismet.cids.server.rest.domain.types.User user) {
    if (de.cismet.cids.custom.crisma.trigger.WorldstateScenarioNodeTrigger.LOGGER.isDebugEnabled()) {
        de.cismet.cids.custom.crisma.trigger.WorldstateScenarioNodeTrigger.LOGGER.debug("afterUpdate");
    }
    afterInsert(jsonObject, user);
}