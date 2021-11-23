@org.junit.Test
public void testEqForEnum() {
    int count = 15;
    for (int i = 0; i < count; i++) {
        com.huntering.common.entity.User user = createUser();
        user.getBaseInfo().setSex(Sex.male);
        userRepository2.save(user);
    }
    com.huntering.common.entity.search.Searchable search = com.huntering.common.entity.search.Searchable.newSearchable().addSearchParam("baseInfo.sex_eq", "male");
}