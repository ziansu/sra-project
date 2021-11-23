@java.lang.Override
public int countWithdrawnItems(org.dspace.core.Context context) throws java.sql.SQLException {
    return itemDAO.countItems(context, true, true);
}