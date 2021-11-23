@com.greenfox.controllers.RequestMapping(value = "/posts/add")
public java.lang.String addPost(org.springframework.ui.Model model) {
    model.addAttribute("post", new com.greenfox.domain.Post());
    return "add";
}