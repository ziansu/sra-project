public int chooseShipToShoot() {
    if ((isDestroyerRdy()) == true) {
        return 1;
    }else
        if ((isFrigateRdy()) == true) {
            return 2;
        }else
            if ((isCorvetteRdy()) == true) {
                return 3;
            }else
                if ((isSubmarineRdy()) == true) {
                    return 4;
                }else {
                    return 0;
                }
            
        
    
}