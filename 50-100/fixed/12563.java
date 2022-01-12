private java.lang.String convertToTableName(android.net.Uri uri) {
    int i = com.ywca.pentref.common.PentrefProvider.mUriMatcher.match(uri);
    switch (com.ywca.pentref.common.PentrefProvider.mUriMatcher.match(uri)) {
        case com.ywca.pentref.common.PentrefProvider.POI_TABLE :
        case com.ywca.pentref.common.PentrefProvider.POI_ROW :
        case com.ywca.pentref.common.PentrefProvider.SEARCH_SUGGESTIONS :
            return com.ywca.pentref.models.Poi.TABLE_NAME;
        case com.ywca.pentref.common.PentrefProvider.CATEGORY_TABLE :
        case com.ywca.pentref.common.PentrefProvider.CATEGORY_ROW :
            return Contract.Category.TABLE_NAME;
        case com.ywca.pentref.common.PentrefProvider.BOOKMARK_TABLE :
        case com.ywca.pentref.common.PentrefProvider.BOOKMARK_ROW :
            return Contract.Bookmark.TABLE_NAME;
        default :
            throw new java.lang.IllegalArgumentException(("Illegal uri: " + uri));
    }
}