public static com.github.vincent_fuchs.comprehensive_testing.model.VolatilityIndex getEnum(java.lang.String index) {
    com.github.vincent_fuchs.comprehensive_testing.model.VolatilityIndex[] values = com.github.vincent_fuchs.comprehensive_testing.model.VolatilityIndex.values();
    for (com.github.vincent_fuchs.comprehensive_testing.model.VolatilityIndex value : values) {
        if (index.equals(value.toString())) {
            return value;
        }
    }
    throw new java.lang.UnsupportedOperationException(("Could not find VolatilityIndex enum for " + index));
}