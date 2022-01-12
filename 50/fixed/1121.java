public void setMemberSkills(java.lang.String skills) {
    java.lang.String[] splitSkills = skills.split(",");
    for (java.lang.String skill : splitSkills) {
        memberSkills.add(skill);
    }
}