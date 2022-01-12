public static com.github.vincent_fuchs.comprehensive_testing.model.Risk getEnum(java.lang.String risk) {
    com.github.vincent_fuchs.comprehensive_testing.model.Risk[] values = com.github.vincent_fuchs.comprehensive_testing.model.Risk.values();
    for (com.github.vincent_fuchs.comprehensive_testing.model.Risk value : values) {
        if (risk.equals(value.toString())) {
            return value;
        }
    }
    throw new java.lang.UnsupportedOperationException(("Could not find Risk enum for " + risk));
}