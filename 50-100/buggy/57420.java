@org.junit.Test
public void testIsNotNull() throws java.text.ParseException {
    int count = 15;
    for (int i = 0; i < count; i++) {
        com.huntering.common.entity.User user = createUser();
        userRepository2.save(user);
    }
    java.util.Map<java.lang.String, java.lang.Object> searchParams = new java.util.HashMap<java.lang.String, java.lang.Object>();
    searchParams.put("username_isNotNull", null);
    com.huntering.common.entity.search.Searchable search = com.huntering.common.entity.search.Searchable.newSearchable(searchParams);
    org.junit.Assert.assertEquals(count, userRepository2.countAllByDefault(search));
}