public static ch.specchio.factories.CampaignFactory getInstance(java.lang.String db_user, java.lang.String db_password, java.lang.String type, java.lang.String datasource_name) throws ch.specchio.factories.SPECCHIOFactoryException {
    if ("specchio".equals(type)) {
        return new ch.specchio.factories.SpecchioCampaignFactory(db_user, db_password, datasource_name);
    }else {
        throw new ch.specchio.factories.SPECCHIOFactoryException((("Unknown campaign type \"" + type) + "\"."));
    }
}