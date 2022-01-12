private java.util.List<java.lang.Long> convertToListLong(java.util.List<javax.ws.rs.core.PathSegment> geriatricFactorValueIds) {
    java.util.List<java.lang.Long> gefIds = new java.util.ArrayList<java.lang.Long>(0);
    for (javax.ws.rs.core.PathSegment segment : geriatricFactorValueIds) {
        gefIds.add(java.lang.Long.valueOf(segment.toString()));
    }
    return gefIds;
}