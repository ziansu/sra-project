@java.lang.Override
protected org.gamboni.cloudspill.file.FileBuilder appendOne(java.lang.String segment, boolean doc) {
    android.net.Uri uri = android.net.Uri.withAppendedPath(target.getUri(), segment);
    android.support.v4.provider.DocumentFile requested = (doc) ? android.support.v4.provider.DocumentFile.fromSingleUri(context, uri) : android.support.v4.provider.DocumentFile.fromTreeUri(context, uri);
    if (requested == null) {
        return new org.gamboni.cloudspill.file.FileBuilder.NotFound(this, segment);
    }else {
        return new org.gamboni.cloudspill.file.FileBuilder.Found(context, requested);
    }
}