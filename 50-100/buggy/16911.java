private boolean assignmentIsSuperseded(org.miradi.migrations.forward.RawObject rawObject, org.miradi.migrations.forward.RawObject assignment) throws java.lang.Exception {
    java.util.ArrayList<org.miradi.migrations.forward.RawObject> childTasks = getChildTasks(rawObject);
    for (org.miradi.migrations.forward.RawObject task : childTasks) {
        java.util.ArrayList<org.miradi.objecthelpers.ORef> childAssignmentRefs = getAssignments(task);
        for (org.miradi.objecthelpers.ORef childAssignmentRef : childAssignmentRefs) {
            org.miradi.migrations.forward.RawObject childAssignment = getRawProject().findObject(childAssignmentRef);
            if (dateUnitContained(assignment, childAssignment))
                return true;
            
            return assignmentIsSuperseded(task, assignment);
        }
    }
    return false;
}