@org.junit.Before
public void setup() throws java.lang.Exception {
    org.mockito.MockitoAnnotations.initMocks(this);
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
}