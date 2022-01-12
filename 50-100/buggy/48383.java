@org.springframework.web.bind.annotation.RequestMapping(value = "/del", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String del(java.lang.Integer articleNo, java.lang.String boardCd, java.lang.Integer curPage, java.lang.String searchWord, javax.servlet.http.HttpSession session) throws java.lang.Exception {
    net.java_school.board.Article article = boardService.getArticle(articleNo);
    boardService.removeArticle(article);
    searchWord = java.net.URLEncoder.encode(searchWord, "UTF-8");
    return (((("redirect:/bbs/list?boardCd=" + boardCd) + "&curPage=") + curPage) + "&searchWord=") + searchWord;
}