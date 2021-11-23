public int getScoutingScore() {
    return (getPerception()) + ((perks.get(Perk.SURVEYOR.toString(), 0)) > 0 ? (perks.get(Perk.SURVEYOR.toString())) * 2 : 0);
}