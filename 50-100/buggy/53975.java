public boolean isAvroSchemaExist(com.ctrip.hermes.meta.entity.Topic topic, int avroid) throws org.unidal.dal.jdbc.DalException {
    java.util.List<com.ctrip.hermes.metaservice.model.Schema> schemas = listSchemaMeta(topic);
    if ((schemas == null) || ((schemas.size()) == 0)) {
        return false;
    }
    for (com.ctrip.hermes.metaservice.model.Schema schema : schemas) {
        if ((schema.getAvroid()) == avroid) {
            return true;
        }
    }
    return false;
}