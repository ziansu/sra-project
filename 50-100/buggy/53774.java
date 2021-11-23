@org.junit.Test
public void testNotEqForEnum() {
    int count = 15;
    for (int i = 0; i < count; i++) {
        com.huntering.common.entity.User user = createUser();
        user.getBaseInfo().setSex(Sex.male);
        userRepository2.save(user);
    }
    com.huntering.common.entity.search.Searchable search = com.huntering.common.entity.search.Searchable.newSearchable().addSearchParam("baseInfo.sex_ne", "male");
    org.junit.Assert.assertEquals(0, userRepository2.countAllByDefault(search));
}