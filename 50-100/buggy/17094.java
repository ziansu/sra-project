@org.springframework.web.bind.annotation.RequestMapping(value = "/getInterviewDetailsById", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<ua.netcracker.controller.InterviewDaysDetails> getInterviewDetailsById(@org.springframework.web.bind.annotation.RequestParam
java.lang.String id) {
    ua.netcracker.controller.InterviewDaysDetails interviewDaysDetails = null;
    interviewDaysDetails = interviewDaysDetailsService.findById(java.lang.Integer.parseInt(id));
    if (interviewDaysDetails != null) {
        return org.springframework.http.ResponseEntity.ok(interviewDaysDetails);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
}