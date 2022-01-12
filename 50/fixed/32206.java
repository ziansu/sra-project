@rest.POST
@rest.Path(value = PATH_CHANGE_AVATAR)
public javax.ws.rs.core.Response changeAvatarLink(model.User user) {
    profileService.changeAvatarLink(user);
    return javax.ws.rs.core.Response.ok().build();
}