private void assignErrorTbl() {
    if (!(org.apache.commons.lang.StringUtils.isEmpty(_tdErrorTableName))) {
        return ;
    }
    if ((_targetTdTableName.length()) <= (azkaban.jobtype.connectors.teradata.TdchParameters.ERROR_TABLE_NAME_LENGTH_LIMIT)) {
        _tdErrorTableName = _targetTdTableName;
    }else {
        azkaban.jobtype.connectors.teradata.TdchParameters._logger.info(((((((("Error table will be randomly decided by Teradata because " + (TdchConstants.DROP_ERROR_TABLE_KEY)) + " is not defined and ") + (TdchConstants.TARGET_TD_TABLE_NAME_KEY)) + " is longer than ") + (azkaban.jobtype.connectors.teradata.TdchParameters.ERROR_TABLE_NAME_LENGTH_LIMIT)) + " so that it cannot be used as a prefix of the error table. Please specify ") + (TdchConstants.ERROR_TABLE_KEY)));
    }
}