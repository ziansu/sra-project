public boolean isConditionMet() {
    switch (this.conditionType) {
        case SUPPLY :
            return (self.supplyUsed()) >= ((this.conditionCount) * 2);
        case BUILDING :
            for (SCBot.Unit u : self.getUnits()) {
                if ((u.getType()) == (this.conditionUnitType))
                    return u.isCompleted();
                
            }
    }
    return false;
}