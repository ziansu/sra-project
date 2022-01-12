@org.springframework.web.bind.annotation.RequestMapping(value = "/removeKnowledgeBase", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.sogeti.VO.KnowledgeBaseVO> removeKnowledgeBase(@org.springframework.web.bind.annotation.RequestBody
com.sogeti.VO.KnowledgeBaseVO kbvo, javax.servlet.http.HttpServletRequest request) {
    java.util.List<com.sogeti.VO.KnowledgeBaseVO> knowledgeBaseList = new java.util.ArrayList<com.sogeti.VO.KnowledgeBaseVO>();
    try {
        com.sogeti.model.KnowledgeBase kb = knowLedgeBaseService.getKnowledgeBaseById(kbvo.getKid());
        knowLedgeBaseService.removeknowledgeBaseForUser(kb);
        knowledgeBaseList = this.getAllKnowledgebase(request);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return knowledgeBaseList;
}