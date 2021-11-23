com.github.tyrantsim.jtuo.sim.CardStatus op() {
    setStorage(card.getType());
    placeCard();
    for (com.github.tyrantsim.jtuo.skills.SkillSpec skillSpec : card.getSkillsOnPlay()) {
        field.addSkillToQueue(status, skillSpec);
    }
    return status;
}