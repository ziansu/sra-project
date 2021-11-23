@org.junit.Test
public void test13_getRowsOtherAccount() {
    try {
        deleteRows();
        test01_addRowPass();
        test01_addRowPass();
        com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given().header(getHeaderOtherAccount()).contentType("application/json").when().get("/api/restricted/session").then().statusCode(200).body("size()", org.hamcrest.core.IsEqual.equalTo(0));
    } catch (com.google.gdata.util.ServiceException | com.google.appengine.api.datastore.EntityNotFoundException | java.io.IOException e) {
        e.printStackTrace();
    }
}