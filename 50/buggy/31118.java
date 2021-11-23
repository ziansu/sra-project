@org.springframework.web.bind.annotation.RequestMapping(value = "/addNews", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView addNews(@org.springframework.web.bind.annotation.ModelAttribute
ru.pelmegov.javashop.model.news.News news, org.springframework.web.servlet.ModelAndView modelAndView, org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    newsService.addNews(news);
    redirectAttributes.addFlashAttribute("success", ("News has added: " + news));
    return new org.springframework.web.servlet.ModelAndView(("redirect: " + (indexNewsView)));
}