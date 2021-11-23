@java.lang.Override
public org.molgenis.data.Repository addEntityMeta(org.molgenis.data.EntityMetaData entityMeta) {
    org.molgenis.data.view.ViewRepository repo = new org.molgenis.data.view.ViewRepository(entityMeta, dataService);
    if (!(searchService.hasMapping(entityMeta)))
        repo.create();
    
    repositories.put(entityMeta.getName(), repo);
    return repo;
}