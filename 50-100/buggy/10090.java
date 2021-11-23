private org.miradi.migrations.forward.DateUnitEffortList getAdjustedDateUnitEffortListForAssignments(org.miradi.migrations.forward.DateUnitEffortList dateUnitEffortListToAdjust, org.miradi.migrations.forward.RawObject rawObject) throws java.lang.Exception {
    java.util.ArrayList<org.miradi.migrations.forward.RawObject> childTasks = getChildTasks(rawObject);
    for (org.miradi.migrations.forward.RawObject task : childTasks) {
        java.util.ArrayList<org.miradi.objecthelpers.ORef> childAssignmentRefs = getAssignments(task);
        for (org.miradi.objecthelpers.ORef childAssignmentRef : childAssignmentRefs) {
            org.miradi.migrations.forward.RawObject childAssignment = getRawProject().findObject(childAssignmentRef);
            dateUnitEffortListToAdjust = getAdjustedDateUnitEffortListForAssignment(dateUnitEffortListToAdjust, childAssignment);
        }
        return getAdjustedDateUnitEffortListForAssignments(dateUnitEffortListToAdjust, task);
    }
    return dateUnitEffortListToAdjust;
}