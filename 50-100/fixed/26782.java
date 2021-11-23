private java.util.Set<fr.solsid.model.AccessRight> extractAccessRights(org.apache.poi.ss.usermodel.Row row) {
    java.util.Set<fr.solsid.model.AccessRight> accessRights = new java.util.HashSet<>();
    for (int i = 2; i <= 7; i++) {
        java.lang.Integer accessRight = getNumericValueOf(row, i);
        if (hasRight(accessRight)) {
            accessRights.add(fr.solsid.service.AccessRightsFileReader.columnToAccessRight.get(i));
        }
    }
    return accessRights;
}