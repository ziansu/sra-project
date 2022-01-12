@org.springframework.web.bind.annotation.RequestMapping(value = "/user", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.geppetto.core.data.model.IUser addNewUser(@org.springframework.web.bind.annotation.RequestParam
java.lang.String username, @org.springframework.web.bind.annotation.RequestParam
java.lang.String password) {
    org.geppetto.core.data.IGeppettoDataManager manager = org.geppetto.core.data.DataManagerHelper.getDataManager();
    org.geppetto.core.data.model.IUser user;
    if (!(manager.isDefault())) {
        return manager.getUserByLogin(username);
    }else {
        user = manager.newUser(username, password, true, null);
    }
    return user;
}