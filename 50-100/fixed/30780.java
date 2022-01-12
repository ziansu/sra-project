public java.lang.String getDimMemberStr(org.cboard.dataprovider.config.DimensionConfig config, int index) {
    switch (columnTypes.get(config.getColumnName().toUpperCase())) {
        case java.sql.Types.VARCHAR :
        case java.sql.Types.CHAR :
        case java.sql.Types.NVARCHAR :
        case java.sql.Types.NCHAR :
        case java.sql.Types.CLOB :
        case java.sql.Types.NCLOB :
        case java.sql.Types.LONGVARCHAR :
        case java.sql.Types.LONGNVARCHAR :
        case java.sql.Types.DATE :
        case java.sql.Types.TIMESTAMP :
        case java.sql.Types.TIMESTAMP_WITH_TIMEZONE :
            return ("'" + (config.getValues().get(index))) + "'";
        default :
            return config.getValues().get(index);
    }
}