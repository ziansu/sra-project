@org.junit.Test
public void test21_getRowsDraft() {
    deleteRows();
    test02_addRowDraftPass();
    test01_addRowPass();
    test02_addRowDraftPass();
    com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given().header(getHeader()).contentType("application/json").when().get("/api/restricted/draft").then().statusCode(200).body("size()", org.hamcrest.core.IsEqual.equalTo(2));
}