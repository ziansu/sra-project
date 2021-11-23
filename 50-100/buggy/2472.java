private void defendBase(kingofthehill.domain.GameManager gm) {
    if ((this.aiType) == (AIState.DEFENSIVE)) {
        placeDefenceAtBase(gm, 2);
    }else
        if ((this.aiType) == (AIState.AGRESSIVE)) {
        }else
            if ((this.aiType) == (AIState.MODERNATE)) {
                placeDefenceAtBase(gm, 1);
            }
        
    
}