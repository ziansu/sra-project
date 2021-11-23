@java.lang.Override
protected edu.cmu.ml.rtw.generic.parse.AssignmentList toParseInternalHelper(edu.cmu.ml.rtw.generic.parse.AssignmentList internalAssignments) {
    if ((this.classifier) == null)
        return internalAssignments;
    
    try {
        java.lang.String classifier = edu.cmu.ml.rtw.generic.util.StringUtil.serializeToBase64String(this.classifier);
        internalAssignments.add(edu.cmu.ml.rtw.generic.parse.Assignment.assignmentTyped(null, Context.ObjectType.VALUE.toString(), "classifier", edu.cmu.ml.rtw.generic.parse.Obj.stringValue(classifier)));
    } catch (java.io.IOException e) {
        return null;
    }
    return internalAssignments;
}