public static java.lang.String toCSVTime(java.lang.Object obj, org.apache.sqoop.schema.type.Column col) {
    assert col instanceof org.apache.sqoop.connector.common.Time;
    assert obj instanceof org.joda.time.LocalTime;
    if (((org.apache.sqoop.connector.common.Time) (col)).hasFraction()) {
        return org.apache.sqoop.connector.common.SqoopIDFUtils.encloseWithQuotes(org.apache.sqoop.connector.common.SqoopIDFUtils.tfWithFraction.print(((org.joda.time.LocalTime) (obj))));
    }else {
        return org.apache.sqoop.connector.common.SqoopIDFUtils.encloseWithQuotes(org.apache.sqoop.connector.common.SqoopIDFUtils.tfWithNoFraction.print(((org.joda.time.LocalTime) (obj))));
    }
}