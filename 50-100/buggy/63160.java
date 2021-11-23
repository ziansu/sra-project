protected com.jayway.restassured.specification.ResponseSpecification getResponseSpecificationGet(java.lang.String var1, java.lang.Object var2, java.lang.Object... var3) {
    com.jayway.restassured.specification.ResponseSpecification response = com.jayway.restassured.RestAssured.given().parameters(var1, var2, var3).contentType(ContentType.JSON).expect().contentType(ContentType.JSON).statusCode(HttpStatus.SC_OK);
    return response;
}