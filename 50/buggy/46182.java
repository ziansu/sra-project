@java.lang.Override
public void afterDelete(final java.lang.String domain, final java.lang.String classKey, final java.lang.String objectId, final de.cismet.cids.server.rest.domain.types.User user) {
    if (de.cismet.cids.custom.crisma.trigger.WorldstateNodeTrigger.LOGGER.isDebugEnabled()) {
        de.cismet.cids.custom.crisma.trigger.WorldstateNodeTrigger.LOGGER.debug("afterDelete");
    }
}