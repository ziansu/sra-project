@org.junit.Test
public void testEqForDate() throws java.text.ParseException {
    int count = 15;
    java.lang.String dateStr = "2012-01-15 16:59:00";
    java.text.DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    for (int i = 0; i < count; i++) {
        com.huntering.common.entity.User user = createUser();
        user.setRegisterDate(df.parse(dateStr));
        userRepository2.save(user);
    }
    com.huntering.common.entity.search.Searchable search = com.huntering.common.entity.search.Searchable.newSearchable().addSearchParam("registerDate_eq", dateStr);
}