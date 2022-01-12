public boolean meetsRequirements(java.lang.Class randomClass, float targetPercentage) {
    if ((randomClass.getConnectedClasses().size()) > (sizeLimit)) {
        return false;
    }
    if (isPercentageInfectedWithinTargetRange(targetPercentage)) {
        return (randomClass.getNumStudentsAffected()) < (getAffectedThreshold());
    }
    return true;
}