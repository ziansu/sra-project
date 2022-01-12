private static java.lang.String createWhereClause(org.icatproject.idav.IcatEntityNames icatEntityNames, boolean includeTopLevel) {
    return org.icatproject.idav.IcatStore.createWhereClause(icatEntityNames, org.icatproject.idav.IcatStore.DatafileSearchType.NONE, includeTopLevel, false);
}