public static int getSpawnChance(edu.chalmers.vaporwave.util.PowerUpState powerUpState) {
    if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.HEALTH)) {
        return 3;
    }else
        if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.BOMB_COUNT)) {
            return 1;
        }else
            if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.RANGE)) {
                return 2;
            }else
                if (powerUpState.equals(edu.chalmers.vaporwave.util.PowerUpState.SPEED)) {
                    return 3;
                }
            
        
    
    return 0;
}