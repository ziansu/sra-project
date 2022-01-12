public static java.lang.String toCSVLocalDateTime(java.lang.Object obj, org.apache.sqoop.schema.type.Column col) {
    org.apache.sqoop.connector.common.LocalDateTime localDateTime = ((org.apache.sqoop.connector.common.LocalDateTime) (obj));
    org.apache.sqoop.connector.common.DateTime column = ((org.apache.sqoop.connector.common.DateTime) (col));
    if (column.hasFraction()) {
        return org.apache.sqoop.connector.common.SqoopIDFUtils.encloseWithQuotes(org.apache.sqoop.connector.common.SqoopIDFUtils.dtfWithFractionNoTimeZone.print(localDateTime));
    }else {
        return org.apache.sqoop.connector.common.SqoopIDFUtils.encloseWithQuotes(org.apache.sqoop.connector.common.SqoopIDFUtils.dtfWithNoFractionAndTimeZone.print(localDateTime));
    }
}