public java.util.ArrayList<java.lang.String> getProjectionIds() {
    java.util.ArrayList<java.lang.String> projIds = new java.util.ArrayList<java.lang.String>();
    if (!(projectionInfo.isEmpty())) {
        return new java.util.ArrayList<java.lang.String>(projectionInfo.keySet());
    }else
        if ((neuroMLDocument) != null) {
            for (org.neuroml.model.Projection proj : neuroMLDocument.getNetwork().get(0).getProjection()) {
                projIds.add(proj.getId());
            }
        }
    
    return projIds;
}