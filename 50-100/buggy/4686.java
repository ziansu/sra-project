@org.springframework.web.bind.annotation.RequestMapping(value = "/loandata")
public java.lang.String loandata(java.lang.String page, java.lang.String size, org.springframework.ui.Model model) {
    try {
        size = "10";
        java.util.List<java.lang.String> statuslist = new java.util.ArrayList<java.lang.String>();
        statuslist.add(CrediteInfo.Status.WAIT_ASSIGN);
        org.springframework.data.domain.Page<com.jlfex.hermes.model.CrediteInfo> obj = creditInfoService.queryByCondition(null, page, size, statuslist);
        model.addAttribute("infoList", obj);
    } catch (java.lang.Exception e) {
        com.jlfex.hermes.common.Logger.error("债权导入列表查询异常:", e);
    }
    return "credit/loandata";
}