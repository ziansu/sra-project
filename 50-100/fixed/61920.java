private void associateAssignees(java.util.List<com.deloitte.smt.entity.AssessmentPlan> assessmentPlanList) {
    if (!(org.springframework.util.CollectionUtils.isEmpty(assessmentPlanList))) {
        for (com.deloitte.smt.entity.AssessmentPlan assessmentPlan : assessmentPlanList) {
            if (null != (assessmentPlan.getRiskPlan())) {
                java.util.List<com.deloitte.smt.entity.TopicRiskPlanAssignmentAssignees> topicRiskPlanAssignmentAssigneeList = topicRiskPlanAssignmentAssigneesRepository.findByRiskId(assessmentPlan.getRiskPlan().getId());
                assessmentPlan.getRiskPlan().setTopicRiskPlanAssignmentAssignees(topicRiskPlanAssignmentAssigneeList);
            }
        }
    }
}