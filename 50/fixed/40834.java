@rest.RequestMapping(value = "/lostItemSubmission", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
public java.lang.String lostItemSubmissionActivity(@rest.RequestBody
java.lang.String message) {
    return message;
}