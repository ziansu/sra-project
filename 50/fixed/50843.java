public jp.yokomark.remoteview.reader.RemoteViewsInfo getNestedViewsInfo(android.content.Context context) {
    if ((nested) == null) {
        return null;
    }
    return jp.yokomark.remoteview.reader.RemoteViewsReader.read(context, nested);
}