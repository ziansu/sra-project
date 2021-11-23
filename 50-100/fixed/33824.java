public static java.util.List<com.intel.jndn.management.types.RibEntry> getRouteList(final net.named_data.jndn.Face face) throws com.intel.jndn.management.ManagementException {
    try {
        java.util.List<net.named_data.jndn.Data> segments = com.intel.jndn.management.helpers.FetchHelper.getSegmentedData(face, new net.named_data.jndn.Name("/localhost/nfd/rib/list"));
        return com.intel.jndn.management.helpers.StatusDatasetHelper.wireDecode(segments, com.intel.jndn.management.types.RibEntry.class);
    } catch (java.io.IOException e) {
        throw new com.intel.jndn.management.ManagementException(e.getMessage(), e);
    }
}