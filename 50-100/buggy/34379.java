@org.springframework.web.bind.annotation.RequestMapping(value = "/updateComment", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateComment(java.lang.Integer commentNo, java.lang.Integer articleNo, java.lang.String boardCd, java.lang.Integer curPage, java.lang.String searchWord, java.lang.String memo, java.security.Principal principal) throws java.lang.Exception {
    net.java_school.board.Comment comment = boardService.getComment(commentNo);
    comment.setMemo(memo);
    boardService.modifyComment(comment);
    searchWord = java.net.URLEncoder.encode(searchWord, "UTF-8");
    return (((((("redirect:/bbs/view?articleNo=" + articleNo) + "&boardCd=") + boardCd) + "&curPage=") + curPage) + "&searchWord=") + searchWord;
}