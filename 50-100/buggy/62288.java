public java.util.List<fi.muikku.plugins.workspace.ContentNode> listWorkspaceMaterialsAsContentNodes(fi.muikku.model.workspace.WorkspaceEntity workspaceEntity, boolean includeHidden) throws fi.muikku.plugins.workspace.WorkspaceMaterialException {
    java.util.List<fi.muikku.plugins.workspace.ContentNode> contentNodes = new java.util.ArrayList<>();
    fi.muikku.plugins.workspace.model.WorkspaceRootFolder rootFolder = findWorkspaceRootFolderByWorkspaceEntity(workspaceEntity);
    java.util.List<fi.muikku.plugins.workspace.model.WorkspaceNode> rootMaterialNodes = (includeHidden) ? listWorkspaceNodesByParentAndFolderTypeSortByOrderNumber(rootFolder, WorkspaceFolderType.DEFAULT) : listVisibleWorkspaceNodesByParentAndFolderTypeSortByOrderNumber(rootFolder, WorkspaceFolderType.DEFAULT);
    for (fi.muikku.plugins.workspace.model.WorkspaceNode rootMaterialNode : rootMaterialNodes) {
        fi.muikku.plugins.workspace.ContentNode node = createContentNode(rootMaterialNode);
        contentNodes.add(node);
    }
    return contentNodes;
}