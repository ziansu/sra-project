@org.junit.Before
public void setUp() {
    org.mockito.Mockito.reset(tutServiceMock);
    mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
}