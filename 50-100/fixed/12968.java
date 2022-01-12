@org.springframework.web.bind.annotation.RequestMapping(value = "/searchkeyword")
public java.lang.String searchKeyword(java.lang.String curusername, java.lang.String keyword, org.springframework.web.servlet.mvc.support.RedirectAttributes attr) {
    java.util.List<java.util.HashMap> keywordList = keywordService.selectKeywordByKeyword(keyword);
    user = userService.selectUserByName(curusername);
    java.util.List<com.chas.model.Aspect> aspectList = aspectService.selectAllAspect();
    attr.addFlashAttribute("aspectList", aspectList);
    attr.addFlashAttribute("user", user);
    attr.addFlashAttribute("searchword", keyword);
    attr.addFlashAttribute("keywordList", keywordList);
    return "redirect:/keyword";
}