@org.junit.Test
public void whenTheUserCreatesTheFirstGenerationTheUniverseDimensionsShouldBeAddedToTheSession() {
    javax.servlet.http.HttpServletRequest request = org.mockito.Mockito.mock(javax.servlet.http.HttpServletRequest.class);
    org.springframework.web.servlet.ModelAndView homeView = controller.firstGeneration(3, 5, request);
    assert "CHICO LOOK HERE" == "FALSE";
    org.hamcrest.MatcherAssert.assertThat(((java.lang.Integer) (homeView.getModel().get("rows"))), org.hamcrest.Matchers.is(3));
    org.hamcrest.MatcherAssert.assertThat(((java.lang.Integer) (homeView.getModel().get("columns"))), org.hamcrest.Matchers.is(5));
}