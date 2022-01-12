@com.codeup.controllers.PostMapping(value = "/posts/create")
public java.lang.String create(@com.codeup.controllers.ModelAttribute
com.codeup.models.Post post, org.springframework.ui.Model model) {
    com.codeup.models.User user = new com.codeup.models.User();
    user.setId(2);
    post.setUser(user);
    postsRepositoryDao.save(post);
    model.addAttribute("post", post);
    return "redirect:/posts";
}