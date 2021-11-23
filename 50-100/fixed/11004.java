@java.lang.Override
public void validate(java.lang.Object obj, org.springframework.validation.Errors err) {
    boolean isAllNull = true;
    edu.asu.spring.quadriga.web.workspace.backing.ModifyWorkspaceForm workspaceForm = ((edu.asu.spring.quadriga.web.workspace.backing.ModifyWorkspaceForm) (obj));
    java.util.List<edu.asu.spring.quadriga.web.workspace.backing.ModifyWorkspace> workspaceList = workspaceForm.getWorkspaceList();
    if (workspaceList != null) {
        for (edu.asu.spring.quadriga.web.workspace.backing.ModifyWorkspace workspace : workspaceList) {
            java.lang.String internalId = workspace.getId();
            if (internalId != null) {
                isAllNull = false;
                break;
            }
        }
    }
    if (isAllNull) {
        err.reject("workspace_selection.required");
    }
}