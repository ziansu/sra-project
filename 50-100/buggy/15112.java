public double getBaseCost(purrfect.evolution.Building.BuildingType bType) {
    if (bType == (purrfect.evolution.Building.BuildingType.NONE)) {
        return java.lang.Double.MAX_VALUE;
    }else
        if (bType == (purrfect.evolution.Building.BuildingType.SCRATCHINPOST)) {
            return 20.0;
        }else
            if ((mBType) == (purrfect.evolution.Building.BuildingType.FEEDING_STATION)) {
                return 100.0;
            }else
                if (bType == (purrfect.evolution.Building.BuildingType.CHEW_MOUSE)) {
                    return 500.0;
                }else
                    if (bType == (purrfect.evolution.Building.BuildingType.YARN_BALL)) {
                        return 2500.0;
                    }else
                        if (bType == (purrfect.evolution.Building.BuildingType.CATNIP)) {
                            return 10000.0;
                        }else {
                            return java.lang.Double.MAX_VALUE;
                        }
                    
                
            
        
    
}