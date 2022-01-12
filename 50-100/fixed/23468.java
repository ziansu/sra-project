public static int getSpawnChance(edu.chalmers.vaporwave.util.PowerUpState powerUpState) {
    if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.HEALTH)) {
        return 1;
    }else
        if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.BOMB_COUNT)) {
            return 1;
        }else
            if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.RANGE)) {
                return 1;
            }else
                if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.SPEED)) {
                    return 1;
                }
            
        
    
    return 0;
}