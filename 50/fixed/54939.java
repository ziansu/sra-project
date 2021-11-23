protected java.util.List<teammates.common.datatransfer.attributes.FeedbackSessionAttributes> loadFeedbackSessionsList(java.util.List<teammates.common.datatransfer.attributes.InstructorAttributes> instructorList) {
    return logic.getFeedbackSessionsListForInstructor(instructorList);
}