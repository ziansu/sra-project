@java.lang.Override
public javax.servlet.http.HttpSession performLogin() throws java.lang.Exception {
    return getMockMvc().perform(org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post("/login_ajax").param("userName", org.jtalks.jcommune.test.utils.popup.USERNAME).param("password", org.jtalks.jcommune.test.utils.popup.PASSWORD)).andReturn().getRequest().getSession();
}