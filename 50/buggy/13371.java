@org.junit.Test
public void testGetImageNotFound() {
    javax.servlet.http.HttpServletResponse response = org.mockito.Mockito.mock(javax.servlet.http.HttpServletResponse.class);
    this.imageController.getImage((-1), 0, response);
    org.mockito.Mockito.verify(response).setStatus(HttpServletResponse.SC_NOT_FOUND);
}