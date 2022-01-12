@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/categories/{categoryId}")
public java.lang.String searchPostsAction(org.springframework.ui.ModelMap model, @org.springframework.web.bind.annotation.PathVariable(name = "categoryId")
final java.lang.String categoryId) {
    java.util.List<be.nille.blog.domain.category.Category> categories = categoryService.findAll();
    java.util.List<be.nille.blog.domain.post.Post> posts = postService.findPostsByCategory(categoryId);
    model.put("page", new be.nille.blog.web.controller.post.PostsPage(posts, categories, null));
    return "blog/index";
}