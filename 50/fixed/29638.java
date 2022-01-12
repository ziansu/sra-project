@org.junit.Before
public void setup() {
    request = new org.springframework.mock.web.MockHttpServletRequest();
    response = new org.springframework.mock.web.MockHttpServletResponse();
    writer = new org.springframework.security.web.header.writers.CacheControlHeadersWriter();
}