protected java.util.Map<org.apache.kafka.common.protocol.Errors, java.lang.Integer> errorCounts(org.apache.kafka.common.protocol.Errors error) {
    if (error != (org.apache.kafka.common.protocol.Errors.NONE))
        return java.util.Collections.singletonMap(error, 1);
    else
        return java.util.Collections.emptyMap();
    
}