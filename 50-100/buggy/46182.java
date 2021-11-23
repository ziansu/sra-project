@org.junit.Test
public void testCountAllByCustomSearch1() {
    int count = 15;
    for (int i = 0; i < count; i++) {
        com.huntering.common.entity.User user = createUser();
        user.getBaseInfo().setRealname(("zhang" + i));
        userRepository2.save(user);
    }
    com.huntering.common.entity.search.Searchable search = com.huntering.common.entity.search.Searchable.newSearchable().addSearchParam("realname", "zhang1");
    org.junit.Assert.assertEquals(6, userRepository2.countAllByCustom(search));
}