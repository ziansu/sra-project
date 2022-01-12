protected void initializeOrdinal(final int defaultOrdinal) {
    this.ordinal = defaultOrdinal;
    java.lang.String ordinal = get(PropertySource.TAMAYA_ORDINAL);
    if (ordinal != null) {
        try {
            this.ordinal = java.lang.Integer.valueOf(ordinal);
        } catch (java.lang.NumberFormatException e) {
            org.apache.tamaya.core.propertysource.BasePropertySource.LOG.log(java.util.logging.Level.WARNING, "Specified {0} is not a valid Integer value: {1} - using defaultOrdinal {2}", new java.lang.Object[]{ org.apache.tamaya.spi.PropertySource.TAMAYA_ORDINAL , ordinal , defaultOrdinal });
        }
    }
}