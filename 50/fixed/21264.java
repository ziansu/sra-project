@java.lang.Override
public com.ecube.solutions.ecube.network.JsonItem userRemove(com.ecube.solutions.ecube.authentication.profile.dao.User user) {
    com.ecube.solutions.ecube.network.JsonItem item = new com.ecube.solutions.ecube.network.CloudFetchr().userRemove(user.getEmail(), user.getLanguage());
    return item;
}