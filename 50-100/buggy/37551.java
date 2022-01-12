@org.springframework.web.bind.annotation.RequestMapping(value = "/sys/news/add", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.shandong.human.resource.util.Result newsAdd(org.springframework.ui.Model model, com.shandong.human.resource.domain.News news, javax.servlet.http.HttpSession httpSession) {
    news.setUserId(10);
    java.lang.Integer id = newsService.addNews(news);
    if (id > 0) {
        return new com.shandong.human.resource.util.Result(Result.Status.SUCCESS, com.shandong.human.resource.util.Constant.REG_SUCCESS);
    }else {
        return new com.shandong.human.resource.util.Result(Result.Status.ERROR, com.shandong.human.resource.util.Constant.REG_FAIL);
    }
}