@com.cefothe.bgjudge.submissions.controller.PostMapping(value = "create")
public org.springframework.http.ResponseEntity submit(@com.cefothe.bgjudge.submissions.controller.RequestBody
com.cefothe.bgjudge.submissions.dto.SubmissionTO submissionTO) throws java.io.IOException {
    submissionService.create(submissionTO);
    return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.OK);
}