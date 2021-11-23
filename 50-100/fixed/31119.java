@accew.comment.web.RequestMapping(value = "/addComment", method = RequestMethod.POST)
public java.lang.String addComment(accew.comment.model.Comment c, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.ui.Model model) {
    java.lang.String userNo = getUserNo(request, response);
    c.setCreateUser(userNo);
    commentService.addComment(c);
    model.addAttribute("userNo", userNo);
    return "/comment/list";
}