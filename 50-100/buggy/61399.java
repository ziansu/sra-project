public boolean meetsRequirements(java.lang.Class randomClass, float targetPercentage) {
    if (isPercentageInfectedWithinTargetRange(targetPercentage)) {
        return (randomClass.getNumStudentsAffected()) < (getAffectedThreshold());
    }else {
        return (randomClass.getConnectedClasses().size()) > (sizeLimit);
    }
}