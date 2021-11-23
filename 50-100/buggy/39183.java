@java.lang.SuppressWarnings(value = "unchecked")
public java.util.ArrayList<crac.utilityModels.EvaluatedTask> findMatch(crac.models.CracUser user) {
    crac.utilityModels.TaskSearchLogger logger = crac.utilityModels.TaskSearchLogger.getInstance();
    logger.setTitlePerson(user.getName());
    java.util.Set<crac.models.Competence> userCompetences = new java.util.HashSet<crac.models.Competence>();
    for (crac.relationmodels.UserCompetenceRel ucr : user.getCompetenceRelationships()) {
        userCompetences.add(ucr.getCompetence());
    }
    java.util.ArrayList<crac.utilityModels.TravelledCompetenceCollection> competenceStacks = augmentAll(userCompetences);
    return null;
}