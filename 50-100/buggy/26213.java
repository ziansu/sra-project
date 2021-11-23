public static com.cggcoding.models.TreatmentPlan load(java.sql.Connection cn, int treatmentPlanID) throws com.cggcoding.exceptions.ValidationException, java.sql.SQLException {
    com.cggcoding.models.TreatmentPlan plan = null;
    plan = com.cggcoding.models.TreatmentPlan.dao.treatmentPlanLoadBasic(cn, treatmentPlanID);
    java.util.List<java.lang.Integer> stageIDs = com.cggcoding.models.TreatmentPlan.dao.treatmentPlanGetStageIDs(cn, treatmentPlanID);
    for (int stageID : stageIDs) {
        plan.addStage(com.cggcoding.models.Stage.load(cn, stageID));
    }
    if ((plan.getStages().size()) == 0) {
        throw new com.cggcoding.exceptions.ValidationException(com.cggcoding.utils.messaging.ErrorMessages.STAGES_IS_EMPTY);
    }
    return plan;
}