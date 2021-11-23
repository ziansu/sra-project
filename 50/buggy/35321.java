@com.datapine.web.controller.RequestMapping(value = "/add", method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView addItem(@com.datapine.web.controller.RequestParam(value = "id", required = true)
java.lang.String email) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView("addItem");
    model.addObject("item", new com.datapine.domain.Item());
    return model;
}