private int classifyTags(com.easyinnova.tiff.model.types.IFD ifd, java.util.ArrayList<com.easyinnova.tiff.model.TagValue> oversized, java.util.ArrayList<com.easyinnova.tiff.model.TagValue> undersized) {
    int tagValueSize = 4;
    int n = 0;
    for (com.easyinnova.tiff.model.TagValue tag : ifd.getMetadata().getTags()) {
        int tagsize = getTagSize(tag);
        if (tagsize > tagValueSize) {
            oversized.add(tag);
        }else {
            undersized.add(tag);
        }
        n++;
    }
    return n;
}