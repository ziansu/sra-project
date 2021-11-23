@org.junit.BeforeClass
public static void createIndicesAndData() {
    elasticsearchApi.initializeEntitySetDataModelIndex();
    elasticsearchApi.initializeOrganizationIndex();
    elasticsearchApi.saveEntitySetToElasticsearch(chicagoEmployees, propertyTypesList, owner);
    elasticsearchApi.saveEntitySetToElasticsearch(entitySet2, propertyTypesList, owner);
    elasticsearchApi.createOrganization(organization, owner);
    createEntityData();
}