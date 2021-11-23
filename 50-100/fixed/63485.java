@org.springframework.web.bind.annotation.GetMapping(value = "/admin/keywords/{keywordId}/delete")
public org.springframework.web.servlet.ModelAndView deleteKeyword(@org.springframework.web.bind.annotation.PathVariable(value = "keywordId")
final java.lang.Integer id) {
    pl.hycom.pip.messanger.model.Keyword deletedKeyword = keywordService.findKeywordById(id);
    if (productService.findAllProductsContainingAtLeastOneKeyword(java.util.Arrays.asList(deletedKeyword)).isEmpty()) {
        keywordService.deleteKeyword(id);
        log.info((("Keyword[" + id) + "] deleted !!!"));
    }else {
        log.info(("cannot delete keyword = " + deletedKeyword));
    }
    return new org.springframework.web.servlet.ModelAndView("redirect:/admin/keywords");
}