@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public boolean deleteWorkspace(java.lang.String wsId) {
    edu.asu.spring.quadriga.dto.WorkspaceDTO workspace = getWorkspaceDTO(wsId);
    if (workspace == null) {
        edu.asu.spring.quadriga.dao.impl.workspace.WorkspaceDAO.logger.error("Workspace does not exist.");
        return false;
    }
    deleteWorkspaceProjectMappings(workspace);
    deleteWorkspaceConceptCollectionMappings(workspace);
    deleteWorkspaceDictionaryMappings(workspace);
    deleteWorkspaceDSpaceMappings(workspace);
    deleteWorkspaceEditorMappings(workspace);
    deleteWorkspaceNetworkMappings(workspace);
    updateDTO(workspace);
    deleteDTO(workspace);
    return true;
}