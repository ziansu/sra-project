@org.junit.Test
public void test22_getRowsDraftOtherAccount() {
    try {
        deleteRows();
        test02_addRowDraftPass();
        test01_addRowPass();
        test02_addRowDraftPass();
        com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given().header(getHeaderOtherAccount()).contentType("application/json").when().get("/api/restricted/draft").then().statusCode(200).body("size()", org.hamcrest.core.IsEqual.equalTo(0));
    } catch (com.google.gdata.util.ServiceException | com.google.appengine.api.datastore.EntityNotFoundException | java.io.IOException e) {
        e.printStackTrace();
    }
}