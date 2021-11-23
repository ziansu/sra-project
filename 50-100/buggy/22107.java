private static java.lang.String parseHGid(java.lang.String layer, java.lang.String id) {
    java.lang.CharSequence delimiter = "/";
    if ((org.waag.histograph.queue.InputReader.isNumeric(id)) || (!(id.contains(delimiter)))) {
        return (layer + "/") + id;
    }else {
        return id;
    }
}