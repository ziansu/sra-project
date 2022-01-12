@java.lang.Override
public java.util.Date getEarliestDate() {
    try {
        return dateResolver.getEarliestDate(context);
    } catch (java.sql.SQLException e) {
        org.dspace.xoai.services.impl.xoai.DSpaceRepositoryConfiguration.log.error(e.getMessage(), e);
    } catch (org.dspace.xoai.exceptions.InvalidMetadataFieldException e) {
        org.dspace.xoai.services.impl.xoai.DSpaceRepositoryConfiguration.log.error(e.getMessage(), e);
    }
    return new java.util.Date();
}