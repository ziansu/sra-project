final void queryAuthors(app.zxtune.fs.amp.Country country, app.zxtune.fs.amp.Catalog.AuthorsVisitor visitor) {
    app.zxtune.Log.d(app.zxtune.fs.amp.Database.TAG, "queryAuthors(country=%d)", country.id);
    final java.lang.String selection = app.zxtune.fs.amp.Database.Tables.Authors.getSelection(countryAuthors.getAuthorsIdsSelection(country));
    queryAuthorsInternal(selection, visitor);
}