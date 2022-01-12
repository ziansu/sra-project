@org.springframework.web.bind.annotation.RequestMapping(value = "/search_word", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String searchWord(org.springframework.ui.ModelMap model, javax.servlet.http.HttpServletRequest request) {
    java.lang.String word = request.getParameter("word");
    if (org.apache.commons.lang.StringUtils.isNotBlank(word)) {
        com.ygl.piggynote.controller.dingup.CollinsSearchResult csr = com.ygl.piggynote.util.CollinsDicUtil.searchWordFromWebApi(word);
        if (csr != null) {
            model.addAttribute("collinsSenseList", csr.getSenseList());
            model.addAttribute("searchWordPron", csr.getHeadWord().getPron());
            model.addAttribute("searchWord", word);
        }
    }
    return "dingup/search_word";
}