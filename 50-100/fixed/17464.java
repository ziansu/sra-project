private void savePartialTraining(org.terasology.eventualSkills.components.EntitySkillsComponent skillsComponent, org.terasology.eventualSkills.components.EntityEventualSkillsComponent entityEventualSkillsComponent) {
    if ((entityEventualSkillsComponent.currentSkillInTraining) != null) {
        org.terasology.assets.ResourceUrn currentSkillInTrainingUrn = new org.terasology.assets.ResourceUrn(entityEventualSkillsComponent.currentSkillInTraining);
        if ((entityEventualSkillsComponent.currentSkillLevelInTraining) > (skillsComponent.getSkillLevel(currentSkillInTrainingUrn))) {
            calculatePartialTraining(entityEventualSkillsComponent);
            entityEventualSkillsComponent.partiallyLearnedSkills.put(entityEventualSkillsComponent.currentSkillInTraining.toLowerCase(), entityEventualSkillsComponent.currentTrainingCurrentSkillPoints);
        }else {
            entityEventualSkillsComponent.partiallyLearnedSkills.remove(entityEventualSkillsComponent.currentSkillInTraining.toLowerCase());
        }
    }
    entityEventualSkillsComponent.currentSkillInTraining = null;
    entityEventualSkillsComponent.currentTrainingCurrentSkillPoints = 0;
    entityEventualSkillsComponent.currentSkillLevelInTraining = 0;
    entityEventualSkillsComponent.currentSkillRankInTraining = 0;
    entityEventualSkillsComponent.trainingLastTimeComputedSkillPoints = java.lang.Long.MAX_VALUE;
}