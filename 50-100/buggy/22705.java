@org.junit.Test
public void test2_getRows() {
    try {
        deleteRows();
        test1_addRowPass();
        test1_addRowPass();
        com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given().contentType("application/json").when().get("/api/admin/session").then().statusCode(200).body("size()", org.hamcrest.core.IsEqual.equalTo(2));
    } catch (com.google.gdata.util.ServiceException | java.io.IOException | com.google.appengine.api.datastore.EntityNotFoundException e) {
        e.printStackTrace();
    }
}