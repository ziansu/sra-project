@org.junit.Test
public void testRFC6265_SidExample() {
    java.lang.String rawCookie = "SID=31d4d96e407aad42";
    javax.servlet.http.Cookie[] cookies = parseCookieHeaders(rawCookie);
    org.junit.Assert.assertThat("Cookies.length", cookies.length, org.hamcrest.Matchers.is(1));
    assertCookie("Cookies[0]", cookies[0], "SID", "31d4d96e407aad42", 0, null);
}