@org.springframework.web.bind.annotation.RequestMapping(value = { "/saveSurveyTitle" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.web.servlet.ModelAndView saveSurveyTitle(@org.springframework.web.bind.annotation.RequestParam(value = "surveyTitle")
java.lang.String surveyTitle) {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    java.lang.System.out.println("*********inside save survey title ");
    com.survey.modules.model.SurveyModel surveyModel = new com.survey.modules.model.SurveyModel();
    surveyModel.setSurveyTitle(surveyTitle);
    surveyManager.saveSurvey(surveyModel);
    model.addObject("surveyId", surveyModel.getSurveyId());
    model.setViewName("AddQuestion");
    return model;
}