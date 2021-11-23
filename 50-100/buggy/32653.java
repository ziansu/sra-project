public boolean getInformed(com.gmail.nossr50.datatypes.PlayerProfile PP) {
    switch (this) {
        case BLAST_MINING :
            return PP.getBlastMiningInformed();
        case BERSERK :
            return PP.getBerserkInformed();
        case SUPER_BREAKER :
            return PP.getSuperBreakerInformed();
        case GIGA_DRILL_BREAKER :
            return PP.getGigaDrillBreakerInformed();
        case GREEN_TERRA :
            return PP.getGreenTerraInformed();
        case SKULL_SPLIITER :
            return PP.getSkullSplitterInformed();
        case TREE_FELLER :
            return PP.getTreeFellerInformed();
        case SERRATED_STRIKES :
            return PP.getSerratedStrikesInformed();
    }
    return false;
}