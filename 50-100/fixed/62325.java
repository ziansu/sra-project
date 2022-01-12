@org.springframework.web.bind.annotation.RequestMapping(value = "/getInterviewDetailsByDate", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<ua.netcracker.controller.InterviewDaysDetails> getInterviewDetailsByDate(@org.springframework.web.bind.annotation.RequestParam
java.lang.String id) {
    ua.netcracker.controller.InterviewDaysDetails interviewDaysDetails;
    interviewDaysDetails = interviewDaysDetailsService.findById(interviewDaysDetailsService.getIdbyDate(id));
    if (interviewDaysDetails != null) {
        return org.springframework.http.ResponseEntity.ok(interviewDaysDetails);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NO_CONTENT);
}