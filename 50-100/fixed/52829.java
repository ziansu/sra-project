private java.util.ArrayList<java.lang.String> getAvailableSkills() {
    availableSkills.clear();
    java.util.ArrayList<model.project.Skill> skills = core.getSkills();
    for (model.project.Skill skill : skills) {
        if (!(skillsInUse.contains(skill.getSkillName())))
            availableSkills.add(skill.getSkillName());
        
    }
    return availableSkills;
}