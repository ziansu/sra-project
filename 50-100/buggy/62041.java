@org.junit.Test
public void testDefaultException() {
    exceptionMessage = "Something went wrong somewhere!";
    org.springframework.web.servlet.ModelAndView model = exceptionService.addException(null, exceptionMessage);
    org.junit.Assert.assertEquals(exceptionMessage, model.getModel().get("exception_message"));
    org.junit.Assert.assertEquals("exception", model.getViewName());
}