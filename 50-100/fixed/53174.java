public static void logEvent(org.slf4j.ext.EventData data) {
    if (org.slf4j.ext.EventLogger.eventLogger.instanceofLAL) {
        ((org.slf4j.spi.LocationAwareLogger) (org.slf4j.ext.EventLogger.eventLogger.logger)).log(org.slf4j.ext.EventLogger.EVENT_MARKER, org.slf4j.ext.EventLogger.FQCN, LocationAwareLogger.INFO_INT, data.toXML(), new java.lang.Object[]{ data }, null);
    }else {
        org.slf4j.ext.EventLogger.eventLogger.logger.info(org.slf4j.ext.EventLogger.EVENT_MARKER, data.toXML(), data);
    }
}