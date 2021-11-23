@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.util.List<edu.asu.spring.quadriga.domain.workspace.IWorkSpace> listActiveWorkspace(java.lang.String projectid, java.lang.String user) throws edu.asu.spring.quadriga.exceptions.QuadrigaStorageException {
    return workspaceShallowMapper.listActiveWorkspacesOfOwner(projectid, user);
}