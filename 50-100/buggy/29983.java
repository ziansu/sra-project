@java.lang.Override
public void validate(java.lang.Integer planningId) {
    fr.istic.iodeman.model.Planning planning = planningDAO.findById(planningId);
    org.apache.commons.lang.Validate.notNull(planning);
    fr.istic.iodeman.builder.PlanningExportBuilder builder = new fr.istic.iodeman.builder.PlanningExportBuilder(planning);
    builder.setParticipants(planningDAO.findParticipants(planning));
    builder.validate();
}