@java.lang.Override
@javax.transaction.Transactional
public be.g00glen00b.model.Requirement addRequirementInGoal(be.g00glen00b.model.Requirement requirement, be.g00glen00b.model.Goal goal) {
    if ((goal.getId()) != null) {
        requirementRepository.save(requirement);
        if ((requirement.getId()) != null) {
            goal.addRequirement(requirement);
            goalRepository.save(goal);
        }else {
            requirement = new be.g00glen00b.model.Requirement();
        }
    }else {
        requirement = new be.g00glen00b.model.Requirement();
    }
    return requirement;
}