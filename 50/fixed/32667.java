@com.cefothe.bgjudge.submissions.controller.PostMapping(value = "create")
public void submit(@com.cefothe.bgjudge.submissions.controller.RequestBody
com.cefothe.bgjudge.submissions.dto.SubmissionTO submissionTO) throws java.io.IOException {
    submissionService.create(submissionTO);
}