@java.lang.Override
protected void setInternalArguments(android.os.Bundle args) {
    super.setInternalArguments(args);
    args.putIntArray(de.aw.mainscreen.VIEWRESIDS, de.aw.mainscreen.FragmentDepots.viewResIDs);
    args.putInt(de.aw.mainscreen.LAYOUT, de.aw.mainscreen.FragmentDepots.layout);
    args.putInt(de.aw.mainscreen.VIEWHOLDERLAYOUT, de.aw.mainscreen.FragmentDepots.recyclerViewLayout);
    args.putParcelable(de.aw.mainscreen.DBDEFINITION, de.aw.mainscreen.FragmentDepots.tbd);
    args.putStringArray(de.aw.mainscreen.PROJECTION, de.aw.mainscreen.FragmentDepots.projection);
    args.putString(de.aw.mainscreen.ORDERBY, de.aw.mainscreen.FragmentDepots.orderBy);
    args.putString(de.aw.mainscreen.GROUPBY, de.aw.mainscreen.FragmentDepots.groupBy);
}