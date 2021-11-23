@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/getAllPermissions")
public java.lang.String getAllPermissions() {
    cosbas.permissions.PermissionId[] permissions = permissionManager.allPermissions();
    java.lang.String returnPage = "";
    if (permissions != null) {
        for (int i = 0; i < (permissions.length); i++) {
            cosbas.permissions.PermissionId permission = permissions[i];
            returnPage += ("<option>" + permission) + "</option>";
        }
        if ((permissions.length) == 0) {
            returnPage += "no permissions";
        }
    }else {
        returnPage += "no permissions";
    }
    return returnPage;
}