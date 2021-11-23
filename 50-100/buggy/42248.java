private void processIsA(java.util.Map<java.lang.String, com.silicolife.textmining.core.interfaces.resource.IResourceElement> ontologyIDDatabaseIndex, java.lang.String relationType, java.lang.String externalLink, com.silicolife.textmining.core.datastructures.resources.ontology.loaders.OntologicalClass clO) throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.ANoteException {
    com.silicolife.textmining.core.interfaces.resource.IResourceElement sun = ontologyIDDatabaseIndex.get(externalLink);
    for (java.lang.String isA : clO.getIs_a()) {
        com.silicolife.textmining.core.interfaces.resource.IResourceElement father = ontologyIDDatabaseIndex.get(isA);
        com.silicolife.textmining.core.datastructures.init.InitConfiguration.getDataAccess().addResourceElementsRelation(father, sun, relationType);
    }
}