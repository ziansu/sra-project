@org.springframework.web.bind.annotation.RequestMapping(value = "/editArticle")
public java.lang.String editArticle(org.springframework.ui.Model model, com.suyang.model.Article article) {
    if ((article != null) && (org.springframework.util.StringUtils.isEmpty(article.getId()))) {
        article = articleService.getArticleById(article.getId());
        model.addAttribute("article", article);
    }
    return "/page/article/editArticle";
}