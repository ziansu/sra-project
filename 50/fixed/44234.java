@retrofit2.http.GET(value = "/api/v1/featured/{type}/shops/{category}")
retrofit2.Call<com.hunters.pon.api.ResponseShopFollowCategoryData> getShopFollowCategory(@retrofit2.http.Header(value = "Authorization")
java.lang.String token, @retrofit2.http.Path(value = "type")
java.lang.String featureType, @retrofit2.http.Path(value = "category")
long typeId, @retrofit2.http.Query(value = "latitude")
java.lang.String lat, @retrofit2.http.Query(value = "longitude")
java.lang.String lng, @retrofit2.http.Query(value = "page_size")
java.lang.String size, @retrofit2.http.Query(value = "page_index")
java.lang.String index);