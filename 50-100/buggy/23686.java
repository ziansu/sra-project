@org.springframework.web.bind.annotation.RequestMapping(value = "/dateList")
public java.lang.String dateList(@org.springframework.web.bind.annotation.RequestParam(value = "ajaxDate", required = false)
java.lang.String ajaxDate, @org.springframework.web.bind.annotation.RequestParam(value = "ajaxFlg", required = false, defaultValue = "0")
int ajaxflg, org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("today", kindlereport.web.util.DateUtil.getTodayByString());
    if (ajaxflg == 0) {
        request.setAttribute("pageName", "dateList");
    }else {
        model.addAttribute("dateKindleListList", kindleService.getDateKindleList(ajaxDate));
        request.setAttribute("pageName", "dateList_content");
    }
    return "common_frame";
}