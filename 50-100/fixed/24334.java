private void init() {
    try {
        java.util.List<org.verapdf.features.pb.objects.COSName> filters = imageXObject.getStream().getFilters();
        if (filters != null) {
            for (org.verapdf.features.pb.objects.COSName filter : filters) {
                this.filterNames.add(filter.getName());
            }
        }
    } catch (java.io.IOException e) {
        this.errors.add("Can't get image stream filters");
        org.verapdf.features.pb.objects.PBImageXObjectFeaturesObjectAdapter.LOGGER.info(e);
    }
}