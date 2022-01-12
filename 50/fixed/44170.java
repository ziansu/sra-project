@org.junit.Test
public void testGetCategoriesOk() throws java.lang.Exception {
    response = configResourceRest.getCategories(request);
    java.lang.Object responseTeamList = response.getEntity();
    assertNotNull(responseTeamList);
}