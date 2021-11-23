@org.springframework.web.bind.annotation.RequestMapping(value = "replylist.do", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.sung.hee.shreply.model.SHReply> replyList(com.sung.hee.help.BoardCheck checker, org.springframework.ui.Model model) throws java.lang.Exception {
    com.sung.hee.controller.ReplyController.logger.info("replyList");
    com.sung.hee.controller.ReplyController.logger.info((checker + "ddddddddddddd"));
    return shReplyService.getReplyList(checker);
}