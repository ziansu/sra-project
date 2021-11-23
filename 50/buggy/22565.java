@io.swagger.client.api.FormUrlEncoded
@io.swagger.client.api.GET(value = "fake")
retrofit2.Call<java.lang.Void> testEnumQueryParameters(@io.swagger.client.api.Field(value = "enum_query_string")
java.lang.String enumQueryString, @io.swagger.client.api.Query(value = "enum_query_integer")
java.math.BigDecimal enumQueryInteger, @io.swagger.client.api.Field(value = "enum_query_double")
java.lang.Double enumQueryDouble);