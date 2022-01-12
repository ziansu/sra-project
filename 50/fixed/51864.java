@org.springframework.web.bind.annotation.RequestMapping(value = "/view", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String view(org.springframework.ui.Model model) {
    java.util.List<site.model.Article> articles = adminFacade.findAllArticles();
    model.addAttribute("articles", articles);
    return "/admin/article/view.jsp";
}