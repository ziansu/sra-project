public jp.yokomark.remoteview.reader.RemoteViewsInfo getNestedViewsInfo() {
    if ((nested) == null) {
        return null;
    }
    return jp.yokomark.remoteview.reader.RemoteViewsReader.read(nested);
}