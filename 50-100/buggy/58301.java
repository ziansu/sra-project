@org.springframework.web.bind.annotation.RequestMapping(value = { "/TaskTree" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView taskTree(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    int companyId = edu.nju.software.util.CoUtils.getRequestIntValue(request, "companyId", true);
    java.util.HashMap<java.lang.String, java.lang.Object> model = new edu.nju.software.util.CoHashMap();
    edu.nju.software.util.GeneralResult<java.util.List<edu.nju.software.pojo.Project>> projectResult = workService.getProjectsByCompany(companyId);
    if ((projectResult.getResultCode()) == (edu.nju.software.util.ResultCode.NORMAL)) {
        model.put("projects", projectResult.getData());
    }
    return new org.springframework.web.servlet.ModelAndView("taskTree", "model", model);
}