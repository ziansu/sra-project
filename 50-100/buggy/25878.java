@org.springframework.web.bind.annotation.RequestMapping(value = "/showReasonToDeleteDialog", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView showDialog(@org.springframework.web.bind.annotation.RequestParam
java.lang.Long dealId, org.springframework.ui.ModelMap map, javax.servlet.http.HttpSession session) {
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView("deleteDropWantedDialog");
    try {
        com.drop.controller.form.ReasonToDeleteForm reasonToDeleteForm = new com.drop.controller.form.ReasonToDeleteForm();
        reasonToDeleteForm.setDealId(dealId);
        modelAndView.addObject("reasonToDeleteForm", reasonToDeleteForm);
    } catch (java.lang.Exception e) {
        com.drop.controllers.WantDropController.logger.fatal(com.drop.util.DropUtil.getExceptionDescriptionString(e));
        e.printStackTrace();
        throw new com.drop.exception.DropException();
    }
    return modelAndView;
}