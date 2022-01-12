final boolean queryAuthors(java.lang.String handleFilter, app.zxtune.fs.amp.Catalog.AuthorsVisitor visitor) {
    app.zxtune.Log.d(app.zxtune.fs.amp.Database.TAG, "queryAuthors(filter=%s)", handleFilter);
    final java.lang.String selection = (handleFilter.equals(Catalog.NON_LETTER_FILTER)) ? ("SUBSTR(" + (app.zxtune.fs.amp.Database.Tables.Authors.Fields.handle)) + ", 1, 1) NOT BETWEEN 'A' AND 'Z' COLLATE NOCASE" : (((app.zxtune.fs.amp.Database.Tables.Authors.Fields.handle) + " LIKE '") + handleFilter) + "%'";
    return queryAuthorsInternal(selection, visitor);
}