@java.lang.Override
public void create(oalex.uni.databases.model.WorkSkill workSkill) {
    if (((workSkill.getWorker()) == null) || ((workSkillDAO.findWorkSkillWithAllIds(workSkill.getWorker().getId(), workSkill.getEmployer().getId(), workSkill.getJob().getId())) == null)) {
        workSkillDAO.create(workSkill);
    }
}