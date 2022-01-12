@java.lang.Override
public void updateFromObject() {
    updateEditableState();
    ignoreEditorActions = true;
    org.miradi.objecthelpers.ORefList planningObjectRefs = new org.miradi.objecthelpers.ORefList();
    if (isValidObject()) {
        org.miradi.objects.BaseObject baseObject = org.miradi.objects.BaseObject.find(getProject(), getORef());
        planningObjectRefs = baseObject.getTimeframeRefs();
    }
    timeframeEditor.setPlanningObjectRefs(planningObjectRefs);
    ignoreEditorActions = false;
}