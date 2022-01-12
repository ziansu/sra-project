private Submission.SrlExperiment getFakeExperiment(java.lang.String userId, protobuf.srl.submission.Submission.SrlSubmission sub) {
    protobuf.srl.submission.Submission.SrlExperiment.Builder build = Submission.SrlExperiment.newBuilder();
    build.setUserId(userId).setCourseId(database.SubmissionDatabaseClientTest.COURSE_ID).setAssignmentId(database.SubmissionDatabaseClientTest.ASSIGNMENT_ID).setProblemId(database.SubmissionDatabaseClientTest.PROBLEM_ID).setSubmission(sub);
    return build.build();
}