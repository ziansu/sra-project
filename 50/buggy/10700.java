@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    args.putParcelable(de.aw.reports.DBDEFINITION, de.aw.reports.ReportSimpleDetails.tbd);
    args.putString(de.aw.reports.SELECTION, de.aw.reports.ReportSimpleDetails.selection);
    args.putIntArray(de.aw.reports.FROMRESIDS, fromResIDs);
}