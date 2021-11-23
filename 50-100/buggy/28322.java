private static java.util.Set<entities.Skill> generateRandomSkills() {
    int maxSkills = data_generator.FakeWorkersData.random.nextInt(5);
    maxSkills = (maxSkills == 0) ? 1 : maxSkills;
    java.util.Set<entities.Skill> skillSet = new java.util.HashSet<>(1);
    skillSet.add(Skill.S1);
    return skillSet;
}