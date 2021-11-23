public java.util.List<com.gradians.prepwell.db.Skill> getSkills() {
    if (mSkillIds.isEmpty())
        return null;
    
    java.util.ArrayList<java.lang.String> stringIds = new java.util.ArrayList<java.lang.String>();
    for (int j : mSkillIds)
        stringIds.add(java.lang.Integer.toString(j));
    
    return new co.uk.rushorm.core.RushSearch().whereIN("dbId", stringIds).find(com.gradians.prepwell.db.Skill.class);
}