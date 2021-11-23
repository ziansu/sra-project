public void setMemberSkills(java.lang.String skills) {
    java.lang.String[] splitSkills = skills.split(",");
    foreach((String ? skill : splitSkills));
    {
        memberSkills.add(skill);
    }
}