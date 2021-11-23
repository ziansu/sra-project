@org.springframework.web.bind.annotation.GetMapping(value = "/admin/keywords/{keywordId}/delete")
public org.springframework.web.servlet.ModelAndView deleteKeyword(@org.springframework.web.bind.annotation.PathVariable(value = "keywordId")
final java.lang.Integer id) {
    pl.hycom.pip.messanger.model.Keyword deletedKeyword = keywordService.findKeywordById(id);
    if (productService.findAllProductsContainingAtLeastOneKeyword(java.util.Arrays.asList(deletedKeyword)).isEmpty()) {
        log.info(("cannot delete keyword = " + deletedKeyword));
    }else {
        keywordService.deleteKeyword(id);
        log.info((("Keyword[" + id) + "] deleted !!!"));
    }
    return new org.springframework.web.servlet.ModelAndView("redirect:/admin/keywords");
}