@java.lang.Override
public net.model.User takeInfo(net.model.UserLoginDTO userLoginDTO) {
    net.model.User user = new net.model.User();
    user.setUserLogin(userLoginDTO.getUserLogin());
    user.setUserPassword(userLoginDTO.getUserPassword());
    user.setUserEmail(userLoginDTO.getUserEmail());
    user.setUserStatus("cheked");
    return user;
}