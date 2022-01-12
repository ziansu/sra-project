@org.springframework.web.bind.annotation.RequestMapping(value = "/mixcheckCancel", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.chdp.chdpweb.bean.AppResult mixcheckCancel(javax.servlet.http.HttpServletRequest request) {
    int prsId = java.lang.Integer.parseInt(request.getParameter("prsId"));
    int procId = java.lang.Integer.parseInt(request.getParameter("procId"));
    java.lang.String reason = request.getParameter("reason");
    return procService.backwardProcess(prsId, procId, Constants.MIX, 2, reason);
}