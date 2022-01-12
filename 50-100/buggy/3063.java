private teammates.test.pageobjects.InstructorFeedbackResultsPage loginToInstructorFeedbackResultsPage(java.lang.String instructorName, java.lang.String fsName) {
    teammates.common.util.AppUrl resultsUrl = createUrl(Const.ActionURIs.INSTRUCTOR_FEEDBACK_RESULTS_PAGE).withUserId(testData.instructors.get(instructorName).googleId).withCourseId(testData.feedbackSessions.get(fsName).getCourseId()).withSessionName(testData.feedbackSessions.get(fsName).getFeedbackSessionName());
    teammates.test.pageobjects.InstructorFeedbackResultsPage resultsPage = loginAdminToPage(resultsUrl, teammates.test.pageobjects.InstructorFeedbackResultsPage.class);
    return resultsPage;
}