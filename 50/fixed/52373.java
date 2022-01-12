@com.fasterxml.jackson.annotation.JsonGetter(value = "permission_count")
public int getPermissionCount() {
    if ((this.permissions) == null) {
        return 0;
    }
    return this.permissions.size();
}