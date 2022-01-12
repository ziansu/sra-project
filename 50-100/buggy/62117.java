@org.springframework.web.bind.annotation.RequestMapping(value = "/listAllKeyword")
public java.lang.String listAllKeyword(java.lang.String username, org.springframework.web.servlet.mvc.support.RedirectAttributes attr) {
    com.chas.model.User user = userService.selectUserByName(username);
    java.util.List<java.util.HashMap> keywordList = keywordService.selectAllKeywordWithDesc();
    java.util.List<com.chas.model.Aspect> aspectList = aspectService.selectAllAspect();
    attr.addFlashAttribute("aspectList", aspectList);
    attr.addFlashAttribute("user", user);
    attr.addFlashAttribute("searchword", "");
    attr.addFlashAttribute("keywordList", keywordList);
    return "redirect:/keyword";
}