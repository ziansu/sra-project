@java.lang.Override
public org.apache.chemistry.opencmis.commons.server.CmisService getService(org.apache.chemistry.opencmis.commons.server.CallContext context) {
    se.repos.cmis.ReposCmisService service = new se.repos.cmis.ReposCmisService(this.repositoryRoot);
    service.setCallContext(context);
    org.apache.chemistry.opencmis.server.support.CmisServiceWrapper<se.repos.cmis.ReposCmisService> wrapperService = new org.apache.chemistry.opencmis.server.support.CmisServiceWrapper<se.repos.cmis.ReposCmisService>(service, se.repos.cmis.ReposCmisServiceFactory.DEFAULT_MAX_ITEMS_TYPES, se.repos.cmis.ReposCmisServiceFactory.DEFAULT_DEPTH_TYPES, se.repos.cmis.ReposCmisServiceFactory.DEFAULT_MAX_ITEMS_OBJECTS, se.repos.cmis.ReposCmisServiceFactory.DEFAULT_DEPTH_OBJECTS);
    return wrapperService;
}