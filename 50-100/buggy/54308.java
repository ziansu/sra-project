@fr.iutinfo.skeleton.api.GET
@fr.iutinfo.skeleton.api.Path(value = "/auth/login")
public boolean getlogin(@fr.iutinfo.skeleton.api.QueryParam(value = "name")
java.lang.String name, @fr.iutinfo.skeleton.api.QueryParam(value = "mdp")
java.lang.String mdp) {
    fr.iutinfo.skeleton.api.User user = fr.iutinfo.skeleton.api.UserDBResource.dao.findByName(name);
    if (user == null) {
        throw new fr.iutinfo.skeleton.api.WebApplicationException(403);
    }
    if (!(user.isGoodPassword(mdp)))
        throw new fr.iutinfo.skeleton.api.WebApplicationException(403);
    
    return true;
}