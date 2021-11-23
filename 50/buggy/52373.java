@com.fasterxml.jackson.annotation.JsonGetter(value = "permission_count")
public int getPermissionCount() {
    return this.permissions.size();
}