@org.springframework.web.bind.annotation.RequestMapping(value = "/page/{pageId}")
public java.lang.String pageAction(org.springframework.ui.ModelMap model, @org.springframework.web.bind.annotation.PathVariable(name = "pageId")
final int pageId) {
    be.nille.blog.service.PageInfo pageInfo = new be.nille.blog.service.PageInfo(pageId, 10, postService.getNumberOfPosts());
    model.put("page", new be.nille.blog.web.controller.post.PostsPage(postService.findByPageInfo(pageInfo), categoryService.findAll()));
    return "blog/index";
}