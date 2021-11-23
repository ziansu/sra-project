private java.lang.String buildSortOrder(com.chd.MediaMgr.utils.MediaFileUtil.SortMethod sort) {
    java.lang.String sortOrder = null;
    switch (sort) {
        case name :
            sortOrder = (MediaStore.Files.FileColumns.TITLE) + " asc";
            break;
        case size :
            sortOrder = (MediaStore.Files.FileColumns.SIZE) + " asc";
            break;
        case date :
            sortOrder = (MediaStore.Files.FileColumns.DATE_MODIFIED) + " desc";
            break;
        case type :
            sortOrder = (((MediaStore.Files.FileColumns.MIME_TYPE) + " asc, ") + (MediaStore.Files.FileColumns.TITLE)) + " asc";
            break;
    }
    return sortOrder;
}