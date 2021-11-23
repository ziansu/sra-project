@retrofit2.http.FormUrlEncoded
@retrofit2.http.POST(value = com.mredrock.cyxbs.config.Const.API_SOCIAL_OFFICIAL_NEWS_LIST)
rx.Observable<com.mredrock.cyxbs.model.social.OfficeNews> getSocialOfficialNewsList(@retrofit2.http.Field(value = "size")
int size, @retrofit2.http.Field(value = "page")
int page, @retrofit2.http.Field(value = "stuNum")
java.lang.String stuNum, @retrofit2.http.Field(value = "idNum")
java.lang.String idNum, @retrofit2.http.Field(value = "type_id")
java.lang.String type_id);