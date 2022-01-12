private void saveRecords(java.util.List<objects.databaseObjects.Requirement> requirementList, boolean newAdvancement) {
    advancement = objects.objectLogic.LogicAdvancement.save(advancement);
    if (newAdvancement) {
        for (objects.databaseObjects.Requirement requirement : requirementList) {
            requirement.setParentId(advancement.getId());
        }
    }
    objects.objectLogic.LogicRequirement.save(requirementList);
    util.CacheObject.addToAdvancements(advancement);
    util.CacheObject.addToRequirements(requirementList);
}