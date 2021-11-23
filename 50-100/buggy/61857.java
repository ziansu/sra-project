@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    args.putParcelable(de.aw.snippets.DBDEFINITION, de.aw.snippets.SnippetDepotUebersicht.tbd);
    args.putInt(de.aw.snippets.VIEWHOLDERLAYOUT, detailView);
    args.putIntArray(de.aw.snippets.VIEWRESIDS, viewResIDs);
    args.putIntArray(de.aw.snippets.FROMRESIDS, fromResIDs);
    args.putStringArray(de.aw.snippets.PROJECTION, projection);
    args.putString(de.aw.snippets.SELECTION, de.aw.snippets.SnippetDepotUebersicht.selection);
    args.putString(de.aw.snippets.GROUPBY, groupBy);
    args.putString(de.aw.snippets.ORDERBY, orderBy);
}