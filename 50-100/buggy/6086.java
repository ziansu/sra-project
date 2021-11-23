public boolean successTest(fr.polytech.ressources.Charact source) {
    boolean successTest = false;
    switch (this.assocStat) {
        case 0 :
            successTest = source.getAbilityScores().abilityTestStrength();
        case 1 :
            successTest = source.getAbilityScores().abilityTestDexterity();
        case 2 :
            successTest = source.getAbilityScores().abilityTestIntel();
    }
    this.success = successTest;
    return successTest;
}