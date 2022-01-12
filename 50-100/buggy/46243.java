@org.testng.annotations.Test(timeOut = se.ivankrizsan.restexample.restadapter.RestResourceTestBase.TEST_TIMEOUT)
public void testDeleteEntity() throws java.io.IOException {
    io.restassured.RestAssured.given().when().delete((((mResourceUrlPath) + "/") + (mExpectedEntity.getId()))).then().statusCode(200);
    final E thePersistedEntityAfterDelete = mEntityRepository.findOne(mExpectedEntity.getId());
    org.testng.Assert.assertNull(thePersistedEntityAfterDelete, "Entity should have been deleted");
}