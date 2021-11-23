public int chooseShipToShoot() {
    if (isDestroyerRdy()) {
        return 1;
    }else
        if (isFrigateRdy()) {
            return 2;
        }else
            if (isCorvetteRdy()) {
                return 3;
            }else
                if (isSubmarineRdy()) {
                    return 4;
                }else {
                    return 0;
                }
            
        
    
}