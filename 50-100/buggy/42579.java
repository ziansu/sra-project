public int getXpToLevel(com.gmail.nossr50.datatypes.skills.SkillType skillType) {
    int level = (com.gmail.nossr50.config.experience.ExperienceConfig.getInstance().getCumulativeCurveEnabled()) ? com.gmail.nossr50.util.player.UserManager.getPlayer(playerName).getPowerLevel() : skills.get(skillType);
    com.gmail.nossr50.datatypes.experience.FormulaType formulaType = com.gmail.nossr50.config.experience.ExperienceConfig.getInstance().getFormulaType();
    return mcMMO.getFormulaManager().getCachedXpToLevel(level, formulaType);
}