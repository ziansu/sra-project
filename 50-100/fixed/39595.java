@org.junit.Test
public void testLinks() {
    java.lang.String mvcLink = lesson.getLink();
    assertThat(mvcLink, org.hamcrest.CoreMatchers.startsWith("#attack/"));
    assertThat(mvcLink, org.hamcrest.CoreMatchers.endsWith("/900"));
    java.lang.String srvLink = lesson.getServletLink();
    assertThat(srvLink, org.hamcrest.CoreMatchers.startsWith("attack?Screen="));
    assertThat(srvLink, org.hamcrest.CoreMatchers.endsWith("&menu=900"));
}