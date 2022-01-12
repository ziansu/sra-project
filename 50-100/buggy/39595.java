@org.junit.Test
public void testLinks() {
    java.lang.String mvcLink = lesson.getLink();
    org.junit.Assert.assertThat(mvcLink, org.hamcrest.CoreMatchers.startsWith("#attack/"));
    org.junit.Assert.assertThat(mvcLink, org.hamcrest.CoreMatchers.endsWith("/900"));
    java.lang.String srvLink = lesson.getServletLink();
    org.junit.Assert.assertThat(srvLink, org.hamcrest.CoreMatchers.startsWith("attack?Screen="));
    org.junit.Assert.assertThat(srvLink, org.hamcrest.CoreMatchers.endsWith("&menu=900"));
}