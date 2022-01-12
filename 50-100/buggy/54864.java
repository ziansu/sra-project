@org.springframework.web.bind.annotation.RequestMapping(value = com.englishschool.datamodel.CommonURLs.TEST_CHECK_URL, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String checkTest(@org.springframework.web.bind.annotation.ModelAttribute(value = PASSED_TEST_MODEL)
com.englishschool.entity.spring.PassedTestModelAttribute passedModel, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    javax.servlet.http.HttpSession session = request.getSession();
    java.lang.String profileID = ((java.lang.String) (session.getAttribute(com.englishschool.controllers.PROFILE_ID)));
    com.englishschool.controllers.PassedTest passedTestFromModel = getPassedTestFromModel(passedModel, session);
    passedTestService.save(passedTestFromModel);
    removeAllCookies(request, response);
    invalidateTestInfoFromSession(session);
    return "redirect:/result/test/" + (passedTestFromModel.getId());
}