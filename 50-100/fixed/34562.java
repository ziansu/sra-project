private void initializeMetadataConversions(java.lang.String[] data, com.univocity.parsers.common.record.MetaData md) {
    if ((conversions) != null) {
        synchronized(this) {
            java.lang.String[] headers = headers();
            if (headers == null) {
                headers = data;
            }
            conversions.prepareExecution(false, headers);
            md.setDefaultConversions(conversions.getConversions(md.index, md.type));
        }
    }
}