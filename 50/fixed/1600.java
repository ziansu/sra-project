public int getNumProposals() {
    if (this.personality.isType(PersonalityType.NEUTRAL))
        return 1;
    else
        return random.nextInt(((personality.getMaxProposals()) + 1));
    
}