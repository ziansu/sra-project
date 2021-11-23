@java.lang.Override
public void onDelete(java.lang.Object entity) {
    if (entity instanceof org.sipfoundry.sipxconfig.commserver.Location) {
        org.sipfoundry.sipxconfig.commserver.Location location = ((org.sipfoundry.sipxconfig.commserver.Location) (entity));
        if (location.isUninitialized()) {
            m_jdbcTemplate.execute(java.lang.String.format("delete from feature_local where location_id=%d", location.getId()));
        }else {
            java.util.Set<org.sipfoundry.sipxconfig.feature.LocationFeature> on = getEnabledLocationFeatures(location);
            enableLocationFeatures(on, location, false);
        }
    }
}