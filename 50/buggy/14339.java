@java.lang.Override
public ai.subut.kurjun.model.identity.UserSession extract(ninja.Context context) {
    java.lang.String uSessionStr = context.getSession().get(SecurityFilter.USER_SESSION);
    ai.subut.kurjun.model.identity.UserSession userSession = new com.google.gson.Gson().fromJson(uSessionStr, ai.subut.kurjun.identity.DefaultUserSession.class);
    return userSession;
}