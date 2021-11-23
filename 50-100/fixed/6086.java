public boolean successTest(fr.polytech.ressources.Charact source) {
    boolean successTest = false;
    switch (this.assocStat) {
        case 0 :
            successTest = source.getAbilityScores().abilityTestStrength();
            break;
        case 1 :
            successTest = source.getAbilityScores().abilityTestDexterity();
            break;
        case 2 :
            successTest = source.getAbilityScores().abilityTestIntel();
            break;
    }
    this.success = successTest;
    return successTest;
}