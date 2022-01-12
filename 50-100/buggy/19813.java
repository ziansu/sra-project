@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String renderHomePage(javax.servlet.http.HttpSession session, org.springframework.ui.ModelMap model) {
    model.addAttribute("username", ((java.lang.String) (session.getAttribute("loggedInUsername"))));
    java.util.List<app.model.Post> posts = service.getAllPosts();
    java.lang.String postsJSON = service.postsToJSON(posts);
    model.addAttribute("posts", posts);
    model.addAttribute("postsJSON", postsJSON);
    return "index";
}