@java.lang.Override
public ch.uzh.ifi.feedback.orchestrator.model.FeedbackMechanism GetById(int mechanismId) throws java.sql.SQLException, javassist.NotFoundException {
    ch.uzh.ifi.feedback.orchestrator.model.FeedbackMechanism mechanism = super.GetById(mechanismId);
    mechanism.setParameters(parameterService.GetWhere(java.util.Arrays.asList(java.util.Arrays.asList(mechanism.getId()), "mechanisms_id = ?")));
    return mechanism;
}