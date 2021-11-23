private static java.util.Set<entities.Skill> generateRandomSkills() {
    java.util.Set<entities.Skill> skillSet = new java.util.HashSet<>(1);
    int maxSkills = 1;
    int i = 0;
    while (i < maxSkills) {
        skillSet.add(entities.Skill.values()[data_generator.FakeWorkersData.random.nextInt(5)]);
        i++;
    } 
    return skillSet;
}