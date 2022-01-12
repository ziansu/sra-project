public java.lang.String getName() {
    model.administration.User currentUser = model.driver.Grader.getUser();
    if (((currentUser != null) && (!(currentUser.getPermissions().contains(PermissionKeys.VIEW_STUDENTS)))) && (!(currentUser.getId().equals(id)))) {
        return "*******";
    }
    return name;
}