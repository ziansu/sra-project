@java.lang.Override
public com.ecube.solutions.ecube.network.JsonItem userChangePhone(com.ecube.solutions.ecube.authentication.profile.dao.User user, java.lang.String newPhone) {
    com.ecube.solutions.ecube.network.JsonItem item = new com.ecube.solutions.ecube.network.CloudFetchr().userChangePhone(user.getId(), user.getPassword(), newPhone, AccountAuthenticator.ACCOUNT_TYPE, user.getAccountAccess(), user.getLanguage());
    return item;
}