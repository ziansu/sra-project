private void restoreStandaloneLinksFromBackup() {
    if ((backupStandaloneLinks) != null) {
        aQute.bnd.build.model.conversions.Converter<java.lang.Object, java.lang.String> converter = model.lookupConverter(bndtools.editor.project.RepositorySelectionPart.PROP_STANDALONE);
        @java.lang.SuppressWarnings(value = "unchecked")
        java.util.List<aQute.bnd.build.model.clauses.HeaderClause> restored = ((java.util.List<aQute.bnd.build.model.clauses.HeaderClause>) (converter.convert(backupStandaloneLinks)));
        standaloneLinks = restored;
        backupStandaloneLinks = null;
    }
}