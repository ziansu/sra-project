private java.lang.String getSortOrder(java.lang.String sortOrderValue) {
    java.lang.String sortOrder = "";
    switch (java.lang.Integer.parseInt(sortOrderValue)) {
        case 0 :
            sortOrder = "";
            break;
        case 1 :
            sortOrder = (com.pd.noteonthego.helper.NoteContentProvider.COLUMN_NOTES_CREATED_TIMESTAMP) + " DESC";
            break;
        case 2 :
            sortOrder = (com.pd.noteonthego.helper.NoteContentProvider.COLUMN_NOTES_lAST_MODIFIED_TIMESTAMP) + " DESC";
            break;
        case 3 :
            sortOrder = "";
            break;
        case 4 :
            sortOrder = "";
            break;
        case 5 :
            sortOrder = "";
            break;
        default :
            sortOrder = "";
            break;
    }
    return sortOrder;
}