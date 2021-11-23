private java.lang.String getPreviousBatchType(int cusIdx) {
    java.lang.String result = input.get((cusIdx - 1)).getBatchType();
    uk.gov.dvla.osg.batch.BatchEngine.LOGGER.info("getPreviousBatchType({}) returned '{}'", (cusIdx - 1), result);
    return result;
}