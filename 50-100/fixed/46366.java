@java.lang.Override
public int searchResultCount(org.dspace.core.Context context, java.lang.String groupIdentifier) throws java.sql.SQLException {
    int result = 0;
    java.util.UUID uuid = org.dspace.util.UUIDUtils.fromString(groupIdentifier);
    if (uuid == null) {
        result = groupDAO.countByNameLike(context, groupIdentifier);
    }else {
        org.dspace.eperson.Group group = find(context, uuid);
        if (group != null) {
            result = 1;
        }
    }
    return result;
}