public void addExperience(float experience) {
    source.Player.getInstance().setExperience(((source.Player.getInstance().getExperience()) + ((source.Player.getInstance().getNextLevel()) / 14)));
    source.Player.getInstance().levelUp();
    source.SkillController.getSkill(source.Player.getInstance().getLevel());
}