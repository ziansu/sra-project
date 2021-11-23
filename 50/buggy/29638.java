@org.junit.Before
public void setup() {
    this.request = new org.springframework.mock.web.MockHttpServletRequest();
    this.response = new org.springframework.mock.web.MockHttpServletResponse();
    this.writer = new org.springframework.security.web.header.writers.CacheControlHeadersWriter();
}