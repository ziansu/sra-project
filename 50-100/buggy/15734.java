@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/posts/search")
public java.lang.String searchPostsAction(org.springframework.ui.ModelMap model, @org.springframework.web.bind.annotation.RequestParam(required = true, name = "searchValue")
final java.lang.String searchValue) {
    log.info(("searchValue:" + searchValue));
    java.util.List<be.nille.blog.domain.category.Category> categories = categoryService.findAll();
    java.util.List<be.nille.blog.domain.post.Post> posts = postService.fullTextPostSearch(searchValue);
    model.put("page", new be.nille.blog.web.controller.post.PostsPage(posts, categories));
    return "blog/index";
}