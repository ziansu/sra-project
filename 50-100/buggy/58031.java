protected void addSharedSkills(com.vengeful.sloths.Models.Skills.SkillManager skillManager) {
    skillManager.addSkill(new com.vengeful.sloths.Models.Skills.Skill("bind wounds"));
    skillManager.addSkill(new com.vengeful.sloths.Models.Skills.Skill("bargain"));
    skillManager.addSkill(new com.vengeful.sloths.Models.Skills.Skill("observation"));
    skillManager.addSkill(new com.vengeful.sloths.Models.Skills.Skill("bane", 5, 10));
}