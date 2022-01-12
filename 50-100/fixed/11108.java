@java.lang.Override
public void onTransaction(final org.sigmah.offline.indexeddb.Transaction<org.sigmah.offline.indexeddb.Store> transaction) {
    final java.util.List<org.sigmah.shared.dto.ProjectDTO> projects = new java.util.ArrayList<org.sigmah.shared.dto.ProjectDTO>();
    final org.sigmah.offline.dao.RequestManager<java.util.List<org.sigmah.shared.dto.ProjectDTO>> requestManager = new org.sigmah.offline.dao.RequestManager<java.util.List<org.sigmah.shared.dto.ProjectDTO>>(projects, callback);
    getProjectsByIndex(Indexes.PROJECT_FUNDEDS, id, requestManager, transaction);
    getProjectsByIndex(Indexes.PROJECT_FUNDINGS, id, requestManager, transaction);
    requestManager.ready();
}