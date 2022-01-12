@org.springframework.web.bind.annotation.RequestMapping(value = "/items/{asin}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String ajax(@org.springframework.web.bind.annotation.PathVariable
java.lang.String asin, @org.springframework.web.bind.annotation.RequestParam(value = "ajaxflg", required = false, defaultValue = "0")
int ajaxflg, org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("kindle", kindleMapper.selectKindleByAsin(asin));
    model.addAttribute("commentList", commentMapper.selectComment(asin));
    model.addAttribute("tagList", tagMapper.selectTagsByAsin(asin));
    if (ajaxflg == 1) {
        return "items_content";
    }else {
        request.setAttribute("pageName", "items");
        return "common_frame";
    }
}