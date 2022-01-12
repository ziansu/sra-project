private void associateAssignees(java.util.List<com.deloitte.smt.entity.AssessmentPlan> assessmentPlanList) {
    java.util.List<com.deloitte.smt.entity.TopicRiskPlanAssignmentAssignees> topicRiskPlanAssignmentAssigneeList = new java.util.ArrayList<>();
    if (!(org.springframework.util.CollectionUtils.isEmpty(assessmentPlanList))) {
        for (com.deloitte.smt.entity.AssessmentPlan assessmentPlan : assessmentPlanList) {
            if (null != (assessmentPlan.getRiskPlan())) {
                topicRiskPlanAssignmentAssigneeList = topicRiskPlanAssignmentAssigneesRepository.findByRiskId(assessmentPlan.getRiskPlan().getId());
                assessmentPlan.getRiskPlan().setTopicRiskPlanAssignmentAssignees(topicRiskPlanAssignmentAssigneeList);
            }
        }
    }
}