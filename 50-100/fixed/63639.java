private void saveRange(org.ovirt.engine.core.common.businessentities.MacRange entity) {
    org.springframework.jdbc.core.namedparam.MapSqlParameterSource parameterSource = getCustomMapSqlParameterSource().addValue("mac_pool_id", entity.getMacPoolId()).addValue("from_mac", entity.getMacFrom().toLowerCase()).addValue("to_mac", entity.getMacTo().toLowerCase());
    getCallsHandler().executeModification("InsertMacPoolRange", parameterSource);
}