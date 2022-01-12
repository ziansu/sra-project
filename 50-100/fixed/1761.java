@java.lang.Override
public com.eniacdevelopment.EniacHome.Repositories.Shared.Objects.UserAuthenticationResult authenticateUser(com.eniacdevelopment.EniacHome.DataModel.User.Credentials credentials) {
    com.eniacdevelopment.EniacHome.DataModel.User.User user = this.userRepository.getByUserName(credentials.Username);
    if (user == null) {
        return new com.eniacdevelopment.EniacHome.Repositories.Shared.Objects.UserAuthenticationResult() {
            {
                Authenticated = false;
                user.Id = null;
            }
        };
    }
    java.lang.Boolean authenticated = this.userUtils.AuthenticateUser(credentials, user);
    return new com.eniacdevelopment.EniacHome.Repositories.Shared.Objects.UserAuthenticationResult() {
        {
            Authenticated = authenticated;
            UserId = user.Id;
        }
    };
}