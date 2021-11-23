public static fi.muikku.schooldata.SchoolDataIdentifier fromId(java.lang.String id) {
    java.lang.String[] idParts = org.apache.commons.lang3.StringUtils.split(id, '-');
    if ((idParts.length) != 2) {
        throw new java.lang.RuntimeException("Invalid school data identifier");
    }
    return new fi.muikku.schooldata.SchoolDataIdentifier(idParts[1], idParts[0]);
}