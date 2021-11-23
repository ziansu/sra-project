@retrofit2.http.GET(value = "merchants/categories")
retrofit2.Call<java.util.List<com.mitrakreasindo.pos.model.MerchantCategories>> getAllMerchantCategories(@retrofit2.http.Header(value = "merchantCode")
java.lang.String kodeMerchant);