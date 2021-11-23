public boolean isLocationLegal(Logic.Furniture f, Logic.Diff diff) {
    boolean bRes = checkForLegalLocation(f, f.getVirtualLocation(), false);
    return bRes;
}