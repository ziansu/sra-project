@org.junit.Test
public void testDefaultException() {
    exceptionMessage = "Something went wrong somewhere!";
    org.springframework.web.servlet.ModelAndView model = exceptionService.addException(new org.springframework.web.servlet.ModelAndView("exception"), exceptionMessage);
    org.junit.Assert.assertEquals(exceptionMessage, model.getModel().get("exception_message"));
    org.junit.Assert.assertEquals("exception", model.getViewName());
}