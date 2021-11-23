@qasite.web.controller.RequestMapping(value = "/{threadId}/answers/{answerId}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<?> deleteAnswer(@qasite.web.controller.PathVariable(value = "threadId")
java.lang.Long threadId, @qasite.web.controller.PathVariable(value = "answerId")
java.lang.Long answerId, @org.springframework.security.core.annotation.AuthenticationPrincipal
org.springframework.security.core.userdetails.User activeUser) {
    qasite.web.dto.QaThreadDto t = threadservice.getThread(threadId);
    if (!(t.getAuthor().equals(activeUser.getUsername())))
        return new org.springframework.http.ResponseEntity("", org.springframework.http.HttpStatus.FORBIDDEN);
    
    threadservice.deleteAnswer(threadId, answerId);
    return new org.springframework.http.ResponseEntity("", org.springframework.http.HttpStatus.OK);
}