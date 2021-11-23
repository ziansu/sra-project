@org.junit.Before
public void before() {
    user = new metricapp.entity.stakeholders.User();
    user.setPassword("password");
    user.setRole(Role.Questioner);
    user.setGender(Gender.Male);
    user.setLastname("surname");
    user.setBirthday(java.time.LocalDate.parse("2007-12-03"));
    user.setFirstname("name");
    user.setPic("pic");
    user.setUsername("username");
}