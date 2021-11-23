public battlecode.common.RobotType getNeededBuilding() throws battlecode.common.GameActionException {
    if ((messaging.getNumMinerFactories()) < 1)
        return battlecode.common.RobotType.MINERFACTORY;
    else
        if ((messaging.getNumBarracks()) < 2)
            return battlecode.common.RobotType.BARRACKS;
        else
            if ((messaging.getNumTankFactories()) < 2)
                return battlecode.common.RobotType.TANKFACTORY;
            else
                if ((messaging.getNumSupplyDepots()) < ((battlecode.common.Clock.getRoundNum()) / 250))
                    return battlecode.common.RobotType.SUPPLYDEPOT;
                
            
        
    
    return null;
}