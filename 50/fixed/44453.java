@com.orange.espr4fastdata.controller.Before
public void setup() throws java.lang.Exception {
    this.mockMvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
}