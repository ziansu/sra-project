@org.junit.Test
public void testGetDiffImageNotFoundTarget() {
    javax.servlet.http.HttpServletResponse response = mock(javax.servlet.http.HttpServletResponse.class);
    this.imageController.getDiffImage(0, (-1), 0, 0, response);
    verify(response).setStatus(HttpServletResponse.SC_NOT_FOUND);
}