@java.lang.Override
public yoan.shopping.user.SecuredUser generateIdIfAbsentFromDocument(yoan.shopping.user.SecuredUser securedUser) {
    yoan.shopping.user.User user = User.Builder.createFrom(securedUser).withRandomId().build();
    return !(documentHasId(securedUser)) ? SecuredUser.Builder.createFrom(user).withPassword(securedUser.getPassword()).withSalt(securedUser.getSalt()).build() : securedUser;
}