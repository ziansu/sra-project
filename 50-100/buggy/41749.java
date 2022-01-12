@org.springframework.web.bind.annotation.RequestMapping(value = "/logout")
public java.lang.String logout(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest request) {
    com.mpos.dto.TadminLog adminLog = new com.mpos.dto.TadminLog();
    if (((com.mpos.dto.TadminUser) (session.getAttribute(SystemConstants.LOGINED))) != null) {
        adminLog.setAdminId(((com.mpos.dto.TadminUser) (session.getAttribute(SystemConstants.LOGINED))).getAdminId());
    }
    log_content = "success:login out.";
    com.mpos.commons.LogManageTools.writeAdminLog(log_content, adminLog, request);
    session.removeAttribute(SystemConstants.LOGINED);
    session.invalidate();
    return "forward:login";
}