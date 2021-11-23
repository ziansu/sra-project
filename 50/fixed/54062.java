@org.springframework.web.bind.annotation.RequestMapping(value = "/viewBlogPost")
public java.lang.String viewBlogPost(org.springframework.ui.Model model, java.lang.Integer id) {
    model.addAttribute("blogPost", repositoryService.usernameOfPost(id));
    return "viewBlogPost";
}