@retrofit2.http.GET(value = "/user/avatar")
rx.Observable<com.stockholm.api.profile.GetAvatarResp> getAvatar();