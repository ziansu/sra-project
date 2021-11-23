@qasite.web.controller.RequestMapping(value = "/{threadId}", method = RequestMethod.DELETE)
public org.springframework.http.ResponseEntity<?> deleteThread(@qasite.web.controller.PathVariable(value = "threadId")
java.lang.Long threadId, @org.springframework.security.core.annotation.AuthenticationPrincipal
org.springframework.security.core.userdetails.User activeUser) {
    qasite.web.dto.QaThreadDto t = threadservice.getThread(threadId);
    if (t.getAuthor().equals(activeUser.getUsername()))
        return new org.springframework.http.ResponseEntity("", org.springframework.http.HttpStatus.FORBIDDEN);
    
    threadservice.deleteThread(threadId);
    return new org.springframework.http.ResponseEntity("", org.springframework.http.HttpStatus.OK);
}