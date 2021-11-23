@java.lang.Override
public fi.muikku.model.users.UserEntity getLoggedUserEntity() {
    if (((getLoggedUserSchoolDataSource()) == null) || ((getLoggedUserIdentifier()) == null)) {
        return null;
    }
    return userEntityController.findUserEntityByDataSourceAndIdentifier(getLoggedUserSchoolDataSource(), getLoggedUserIdentifier());
}