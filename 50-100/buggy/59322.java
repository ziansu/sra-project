@org.springframework.web.bind.annotation.RequestMapping(value = "/owner/analysis/today")
public java.lang.String today(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest request) {
    if (!(checkLogin(session))) {
        return "redirect:/owner/login";
    }
    com.parknshop.entity.OwnerEntity owner = ((com.parknshop.entity.OwnerEntity) (session.getAttribute(IDefineString.SESSION_USER)));
    java.util.List<com.parknshop.bean.CalculateDbBean> todayData = mCalService.getToday(owner.getOwnerId());
    com.parknshop.utils.Log.debug(("size:" + (todayData.size())));
    request.setAttribute(com.parknshop.controller.OwnerAnalysisController.TODAY, todayData);
    return "analysis/today.jsp";
}