@org.testng.annotations.Test
public void shouldResponseBadRequestForDivideByZero() {
    java.util.HashMap<java.lang.String, java.lang.Object> params = new java.util.HashMap<>();
    params.put("a", 10);
    params.put("b", 0);
    params.put("operation", "div");
    com.jayway.restassured.RestAssured.given().params(params).when().get("/calculate").then().statusCode(HttpStatus.SC_BAD_REQUEST);
}