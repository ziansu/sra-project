@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    args.putParcelable(de.aw.reports.DBDEFINITION, de.aw.reports.ReportSimpleDetails.tbd);
    args.putIntArray(de.aw.reports.FROMRESIDS, fromResIDs);
}