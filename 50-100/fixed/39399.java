public boolean isConditionMet() {
    switch (this.conditionType) {
        case SUPPLY :
            return (this.self.supplyUsed()) >= ((this.conditionCount) * 2);
        case BUILDING :
            for (SCBot.Unit u : this.self.getUnits()) {
                if ((u.getType()) == (this.conditionUnitType))
                    return u.isCompleted();
                
            }
    }
    return false;
}