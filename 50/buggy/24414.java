public int getScoutingScore() {
    return (getPerception()) + (perks.containsKey(Perk.SURVEYOR.toString()) ? (perks.get(Perk.SURVEYOR.toString())) * 2 : 0);
}