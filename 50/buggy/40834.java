@rest.RequestMapping(value = "/lostItemSubmission", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
public java.lang.String lostItemSubmissionActivity(@rest.RequestBody
sun.plugin2.message.Message message) {
    return message.toString();
}