public void addResourceTypes(java.util.List<java.net.URI> types) throws info.rmapproject.webapp.exception.RMapWebException {
    if (types != null) {
        for (java.net.URI type : types) {
            if (type != null) {
                addResourceType(type.toString());
            }
        }
    }
}