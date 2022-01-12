@org.junit.Test
public void checkIfViewIsReturnedCorrectly() {
    org.springframework.web.servlet.ModelAndView modelAndView = new com.tradeshift.controller.HelloWorldController().index();
    junit.framework.Assert.assertEquals("index", modelAndView.getViewName());
}