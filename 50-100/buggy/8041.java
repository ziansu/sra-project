@com.trainingSystem.controller.RequestMapping(value = RestURIConstains.EXPORT_EXCEL, method = RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getExcel(@com.trainingSystem.controller.RequestParam
java.lang.Long idExcel) throws java.lang.Exception {
    java.util.List<com.trainingSystem.controller.ExcelModel> excelModels = ((java.util.List<com.trainingSystem.controller.ExcelModel>) (test.get(idExcel.toString())));
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("excelSender", "excelModels", excelModels);
    return mav;
}