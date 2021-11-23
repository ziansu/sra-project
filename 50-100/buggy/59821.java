@org.junit.Before
public void setUp() {
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(this.wac).build();
    util.TestUtility.initialize();
    util.TestUtility.setUp(userDao, profileDao);
    this.authUser = util.TestUtility.createPrincipal(TestUtility.testUser.getEmail(), "password", "ROLE_TUTOR");
    this.authUserStudent = util.TestUtility.createPrincipal(TestUtility.testUserThree.getEmail(), "password", "ROLE_STUDENT");
}