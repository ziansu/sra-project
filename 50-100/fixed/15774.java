@java.lang.Override
public final com.opower.persistence.jpile.infile.InfileRow append(java.util.Date d, java.lang.reflect.Method method) {
    javax.persistence.Temporal temporal = this.persistenceAnnotationInspector.findAnnotation(method, javax.persistence.Temporal.class);
    com.google.common.base.Preconditions.checkNotNull(temporal, "A temporal annotation must be provided on method [%s]", method);
    switch (temporal.value()) {
        case DATE :
            return appendDate(d, com.opower.persistence.jpile.infile.InfileDataBuffer.DATE_FORMATTER);
        case TIME :
            return appendDate(d, com.opower.persistence.jpile.infile.InfileDataBuffer.TIME_FORMATTER);
        case TIMESTAMP :
            return appendDate(d, com.opower.persistence.jpile.infile.InfileDataBuffer.TIMESTAMP_FORMATTER);
        default :
            throw new java.lang.IllegalArgumentException(java.lang.String.format(com.opower.persistence.jpile.infile.InfileDataBuffer.TEMPORAL_TYPE_EXCEPTION, method));
    }
}