private void defendBase() {
    if ((this.aiType) == (AIState.DEFENSIVE)) {
        placeDefenceAtBase(2);
    }else
        if ((this.aiType) == (AIState.AGRESSIVE)) {
        }else
            if ((this.aiType) == (AIState.MODERNATE)) {
                placeDefenceAtBase(1);
            }
        
    
}