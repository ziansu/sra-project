protected void writeDMLStatementLog(java.lang.String queryType, java.lang.String queryString, java.lang.String consistencyLevel, java.lang.Object... values) {
    org.slf4j.Logger actualLogger = (displayDMLForEntity) ? entityLogger : info.archinnov.achilles.internal.statement.wrapper.AbstractStatementWrapper.dmlLogger;
    if (actualLogger.isDebugEnabled()) {
        actualLogger.debug("{} : [{}] with CONSISTENCY LEVEL [{}]", queryType, queryString, consistencyLevel);
    }
    if (org.apache.commons.lang3.ArrayUtils.isNotEmpty(values)) {
        actualLogger.debug("\t bound values : {}", info.archinnov.achilles.internal.helper.LoggerHelper.replaceByteBuffersByHexString(values));
    }
}