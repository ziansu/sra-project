@accew.comment.web.RequestMapping(value = "/addComment", method = RequestMethod.POST)
public java.lang.String addComment(accew.comment.model.Comment comment, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.ui.Model model) {
    java.lang.String userNo = getUserNo(request, response);
    comment.setCreateUser(userNo);
    commentService.addComment(comment);
    model.addAttribute("userNo", userNo);
    return "/comment/list";
}