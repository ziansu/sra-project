public final com.clilystudio.netbook.model.FollowResult n(java.lang.String string, java.lang.String string2) {
    java.lang.String string3 = (com.clilystudio.netbook.api.ApiService.f) + (java.lang.String.format(java.util.Locale.CHINA, "/user/%s/has/followed/%s", string, string2));
    try {
        com.clilystudio.netbook.model.FollowResult followResult = com.clilystudio.netbook.api.ApiService.a(this.b(com.github.kevinsawicki.http.HttpRequest.get(string3)), com.clilystudio.netbook.model.FollowResult.class);
        return followResult;
    } catch (java.lang.Exception var4_5) {
        return null;
    }
}